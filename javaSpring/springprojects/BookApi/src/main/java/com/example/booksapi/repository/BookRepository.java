package com.example.booksapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.booksapi.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
 // this method retrieves all the books from the database
 List<Book> findAll();
 // this method finds books with descriptions containing the search string
 List<Book> findByBurgerName(String search);
 // this method counts how many titles contain a certain string
 Long countByRestuarantName(String search);
 // this method deletes a book that starts with a specific title
 Long deleteByTitleStartingWith(String search);
}

