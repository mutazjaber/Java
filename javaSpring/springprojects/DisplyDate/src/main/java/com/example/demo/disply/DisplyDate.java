package com.example.demo.disply;

import java.text.SimpleDateFormat;
import java.util.Date; // Import java.util.Date for the current date and time

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplyDate {

    @RequestMapping("/")
    public String Dashboard() {
        return "Dashboard.jsp";
    }

    @RequestMapping("/date")
    public String date(Model model) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM d, yyyy");

        Date currentDate = new Date();

        model.addAttribute("date", sdf.format(currentDate));

        return "Date.jsp";
    }

    @RequestMapping("/time")
    public String time(Model model) {
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
        Date currentDate = new Date();
        model.addAttribute("time", sdf.format(currentDate));

        return "Time.jsp";
    }
}

//		public class SimpleDateFormat{
//			extends DateFormat;
//			
//			
//			}


