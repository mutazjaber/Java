package com.mutaz.counter.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CController {
	@GetMapping("/")
	public String index(){
		return "index.jsp";
		
	}
		
	@GetMapping("/counter")
	public String counter(HttpSession session){
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else {
			int count = (int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
			}
			return "counter.jsp";

	}

}

