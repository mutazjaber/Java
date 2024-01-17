package com.mutaz.bookclub.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mutaz.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book , Long> {
	
	List<Book> findAll();
	Optional<Book> findByTitleContaining(String search);
	
	Optional<Book> findBookById(Long id);

}
