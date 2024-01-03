package com.example.Daikichi.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Daikichi {

    public static void main(String[] args) {
        SpringApplication.run(Daikichi.class, args);
    }
    @RequestMapping("/travel/{countryName}")
    public String travel(@PathVariable("countryName") String countryName) {
        return "Congratulations! You will travel to " + countryName +"!";
    }
    @RequestMapping("/daikichi/travel/{countryName}")
    public String index(@PathVariable("countryName") String countryName) {
        return "Congratulations, you will soon travel to  " + countryName +"!";
    }

    @RequestMapping("/daikichi/lotto/{number}")
    public String number(@PathVariable("number") Integer number) {
    	 if (number%2 ==  0) {

             return " You will take a grand journey in the near future, but be wary of tempting offers.";
         }

         else {
             return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";

         }
    }
}
;

