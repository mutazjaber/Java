package com.mutaz.gold.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class GoldController {
	ArrayList<String> log = new ArrayList<String>();
	ArrayList<String> color = new ArrayList<String>();
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		return "index.jsp";
	}
	@RequestMapping("/quest")
	public String farm(HttpSession session,
			@RequestParam(value="Form") String Form) {
		Random rand = new Random();
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("y /MMMM /d /EEEE h:m:s a");
		Date date = new Date();
		String formattedDate = simpleDate.format(date);

		String message;
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		
		
		if(Form.contains("farm")) {
			int random = rand.nextInt(10,21);
			int gold = (int) session.getAttribute("gold");
			gold += random;
			session.setAttribute("gold", gold);
			message = "you entered a "+ Form + " and earned "+random;
			color.add("green");

		}

		
		else if(Form.contains("cave")) {
			int random = rand.nextInt(5,11);
			int gold = (int) session.getAttribute("gold");
			gold += random;
			session.setAttribute("gold", gold);
			message = "you entered a "+ Form + " and earned "+random;
			color.add("green");

			
		}
		else if(Form.contains("house")) {
			int random = rand.nextInt(2,6);
			int gold = (int) session.getAttribute("gold");
			gold += random;
			session.setAttribute("gold", gold);
			message = "you entered a "+ Form + " and earned "+random;
			color.add("green");

			
		}

		else{

			int random = rand.nextInt(-50,51);
			int gold = (int) session.getAttribute("gold");
			gold += random;
			session.setAttribute("gold", gold);
			if(random >= 0) {
				message = "you completed a "+ Form + " and earned "+random;
				color.add("green");
			}
			else {
				message = "you failed a "+ Form + " and lost "+Math.abs(random);
				color.add("red");
				
				
			}
			
		}
		message+=" gold.  "+formattedDate;
		log.add(message);
		
		session.setAttribute("log", log);
		session.setAttribute("color", color);
		return "redirect:/";
	}
	
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		log.removeAll(log);
		return "redirect:/";
	}
		
	
	

}

