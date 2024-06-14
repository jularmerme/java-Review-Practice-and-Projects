package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // New Controller Method to show initial HTML Form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // New Controller Method to process the HTML Form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // Read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // Create the message
        String result = "Yo! " + theName;

        // Add message to the Model
        model.addAttribute("message", result);

        return "helloWorld";
    }

    @PostMapping("/processFormVersionThree")
    public String letsDoItAnotherWay(@RequestParam("studentName") String theName, Model model) {

        theName = theName.toUpperCase();
        String result = "Hey " + theName + "!!!!!";
        model.addAttribute("message", result);
        return "helloWorld";
    }

}
