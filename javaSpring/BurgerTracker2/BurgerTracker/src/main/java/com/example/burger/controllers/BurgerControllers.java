package com.example.burger.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.burger.models.Burger;
import com.example.burger.services.BurgerServices;

import jakarta.validation.Valid;

@Controller

public class BurgerControllers {
		

	
	 private final BurgerServices burgerServices;
	 public BurgerControllers(BurgerServices burgerServices){
	     this.burgerServices = burgerServices;
	 }
	   @RequestMapping("/bureger/create")
	    public String Dashboard(@ModelAttribute("burger") Burger burger,Model model) {
		   List<Burger> burgers = burgerServices.allBurgers();
		   model.addAttribute("burgers", burgers);
	        return "index.jsp";
	    }

//	 // other methods removed for brevity
//	 @RequestMapping(value="/burgers/{id}", method=RequestMethod.PUT)
//	 public Burger update(
//	 		@PathVariable("id") Long id, 
//	 		@RequestParam(value="burgerName") String burgerName, 
//	 		@RequestParam(value="restaurantName") String restaurantName, 
//	 		@RequestParam(value="rating") Integer rating) {
//		 Burger burger = burgerServices.updateBurger(id, burgerName, restaurantName, rating);
//	     return burger;
//	 }
//	 
//	 @RequestMapping(value="/burgers/{id}", method=RequestMethod.DELETE)
//	 public void destroy(@PathVariable("id") Long id) {
//		 burgerServices.deleteburger(id);
//	 }
//	 @RequestMapping("/burgers")
//	 public List<Burger> index() {
//	     return burgerServices.allBurgers();
//	 }
	    @PostMapping("/bureger/create")
	    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
	        if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	burgerServices.createBurger(burger);
	            return "redirect:/bureger/create";
	        }
	    }
//	 @RequestMapping(value="/burgers", method=RequestMethod.POST)
//	 public Burger create(@RequestParam(value="burgerName") String burgerName, @RequestParam(value="restaurantName") 
//	 String restaurantName,  @RequestParam(value="rating") Integer rating,@RequestParam(value="restaurantName") 
//	 String restaurantNameno) {
//		 Burger burger = new Burger(burgerName, restaurantName, rating ,notes);
//	     return burgerServices.createBurger(burger);
//	 }
//	 
	 @RequestMapping("/burgers/{id}")
	 public Burger show(@PathVariable("id") Long id) {
		 Burger burger = burgerServices.findBurger(id);
	     return burger	;
	 }
}
	 



