package com.example.burger.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	   
	 @DeleteMapping("/burgers/{id}/delete")
	 public String destroy(@PathVariable("id") Long id) {
		 burgerServices.deleteburger(id);
		 return "redirect:/bureger/create";
	 }
	 
	    @PostMapping("/bureger/create")
	    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
	        if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	burgerServices.createBurger(burger);
	            return "redirect:/bureger/create";
	        }
	    }

	 @RequestMapping("/burgers/{id}")
	 public Burger show(@PathVariable("id") Long id) {
		 Burger burger = burgerServices.findBurger(id);
	     return burger	;
	 }
	 @GetMapping("/edit/{id}")
	    public String editB(@PathVariable("id") Long id, @ModelAttribute("burger") Burger burger, Model model) {
	        model.addAttribute("burger", burgerServices.findBurger(id));
	        return "edit.jsp";
	    }
	 @PutMapping("/edit/{id}")
	    public String update(@Valid @ModelAttribute("burger") Burger burger,BindingResult result,@PathVariable("id") Long id, Model model) {
	        if(result.hasErrors()) {
	            model.addAttribute("burger" ,burger);
	            return "index.jsp";
	        }
	        burgerServices.editBurger(burger);
	        return "redirect:/bureger/create";
	    }
}
	 



