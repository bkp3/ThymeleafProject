package com.practice.controller;

import java.util.Date;
import java.util.List;

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

	// handling iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {

		// create a list, set collection
		List<String> names = List.of("ankit", "ramesh", "lokesh", "bipin", "chandan");
		model.addAttribute("names", names);

		return "iterate";
	}

	// handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("conditional handler executed...");

		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");

		List<Integer> list = List.of(12, 43, 65, 67, 34);
		m.addAttribute("myList", list);

		return "condition";
	}

	// hanlder for fragments
	@GetMapping("/fragments")
	public String fragmentHandler(Model m) {

		m.addAttribute("title", "i like samosa");
		m.addAttribute("subtitle", "why so serious??");

		return "fragments";
	}

	// handler for new about page
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}

}
