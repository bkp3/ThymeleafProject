package com.practice.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {

		System.out.println("Inside the about controller");

		// putting data in model
		model.addAttribute("name", "Ramesh Kumar");
		model.addAttribute("date", new Date().toLocaleString());

		return "about";
		// about.html
	}

}
