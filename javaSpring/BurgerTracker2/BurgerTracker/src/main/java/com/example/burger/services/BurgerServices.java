package com.example.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.burger.models.Burger;
import com.example.burger.repositories.BurgerRepositories;


@Service

public class BurgerServices {
	private final BurgerRepositories burgerRepository;

	 
	 public BurgerServices(BurgerRepositories burgerRepository) {
	     this.burgerRepository = burgerRepository;
	     
	 }
	 
	 // returns all the books
	 public List<Burger> allBurgers() {
	     return burgerRepository.findAll();
	 }
	 // creates a book
	 public Burger createBurger(Burger b) {
	     return burgerRepository.save(b);
	 }
	 // retrieves a book
	 public Burger findBurger(Long id) {
	     Optional<Burger> optionalBurger = burgerRepository.findById(id);
	     if(optionalBurger.isPresent()) {
	         return optionalBurger.get();
	     }  
	    return null;
 
	     
	 }
	 public Burger editBurger(Burger b) {
	     return burgerRepository.save(b);
	 }
	 
	 public Burger updateBurger(Long id ,String burgerName ,String restaurantName, Integer rating ) {
		 Optional<Burger> optionalBurger = burgerRepository.findById(id);
		 if(optionalBurger.isPresent()) {

		 
		 
		 Burger burger = optionalBurger.get();
		 burger.setBurgerName(burgerName);
		 burger.setRestaurantName(restaurantName);
		 burger.setRating(rating);
		return burgerRepository.save(burger);
		 }
		 else {
			 return null;
		 }


	 }
	 
	 public void deleteburger(Long id) {
		 burgerRepository.deleteById(id);
	 }

}
