package com.mutaz.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mutaz.bookclub.models.Book;
import com.mutaz.bookclub.models.User;
import com.mutaz.bookclub.repositories.BookRepository;
import com.mutaz.bookclub.repositories.UserRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private UserRepository userRepository;
	
	public void create(Book book,User user ) {
		book.setUser(user);
		bookRepository.save(book);
	}

	public void deleteBook(Long id) {
		Book book = bookRepository.findById(id).get();
		bookRepository.delete(book);
	}

	public List<Book> ListBooks() {
		List<Book> findBooks = bookRepository.findAll();
		return findBooks;
	}

	public void updateBook(Book book, User user) {
		book.setUser(user);
		bookRepository.save(book);
	}
	public Book findBook(Long id) {
		Book book = bookRepository.findBookById(id).get();
		return book;
	

	}
	
}



