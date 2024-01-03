package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanAssignApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(HelloHumanAssignApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Hello Human";
	}
    @RequestMapping("/name")
    public String name(@RequestParam(value="firstname") String name ,@RequestParam(value="lastname") String lastname) {
        return "Hello "  + name +" "+ lastname;
    }

}
