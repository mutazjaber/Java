package com.example.burger.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.burger.models.Burger;


@Repository


	public interface BurgerRepositories extends CrudRepository<Burger, Long>{
		 // this method retrieves all the books from the database
		 List<Burger> findAll();
		 // this method finds books with descriptions containing the search string
//		 List<Burger> findByDescriptionContaining(String search);
//		 // this method counts how many titles contain a certain string
//		 Long countByTitleContaining(String search);
//		 // this method deletes a book that starts with a specific title
//		 Long deleteByTitleStartingWith(String search);
	}

	

