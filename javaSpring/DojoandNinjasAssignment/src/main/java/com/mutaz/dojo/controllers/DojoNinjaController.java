package com.mutaz.dojo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mutaz.dojo.models.Dojo;
import com.mutaz.dojo.models.Ninja;
import com.mutaz.dojo.services.DojoService;
import com.mutaz.dojo.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoNinjaController {
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	   @RequestMapping("/dojos/new")
	    public String Dojo(@ModelAttribute("dojo") Dojo dojo) {
	        return "createdojo.jsp";
	    }
	   
	    @PostMapping("/dojo")
	    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
	        if (result.hasErrors()) {
	            return "createdojo.jsp";
	        } else {
	        	dojoService.createDojo(dojo);
	        	Long id = dojo.getId();
	            return "redirect:/ninjas/new" ;
	        }
	    }
	    
	    @RequestMapping("/ninjas/new")
	    public String Ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
	    	List<Dojo> dojos = dojoService.allDojos();
	        model.addAttribute("dojos", dojos);
	        return "createninja.jsp";
	    }
	    
	    @PostMapping("/ninja")
	    public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
	        if (result.hasErrors()) {
	            return "createninja.jsp";
	        } else {
	        	ninjaService.createNinja(ninja);
	            return "dojoninja.jsp";
	        }      
	        
	    }
	    @GetMapping("dojos/{id}")
	    public String showDojo(@ModelAttribute("id") Long id, Model model) {
	        Dojo dojo = dojoService.findDojo(id);
	            model.addAttribute("dojo", dojo);
	             return "dojoninja.jsp";
	    }
//	    @RequestMapping("/dojos/{ninja_id}")
//	    public String NinjaId(@ModelAttribute("ninja") Ninja ninja, Model model) {
//	    	List<Ninja> ninja1 = NinjaService.allNinjas();
//	        model.addAttribute("dojos", dojos);
//	        return "dojo.jsp";
//	    }

}
