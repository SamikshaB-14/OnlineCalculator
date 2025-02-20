package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalciController {
	
	@Autowired
	CalciService calciService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
//	@GetMapping
//    public String showForm() {
//        return "calculator"; // This should match your HTML template name (if using Thymeleaf)
//    }
	
	@PostMapping("/calculate")
	public String performOperation(@RequestParam("num1") double num1, 
			@RequestParam("num2") double num2,
			@RequestParam("operation") String opt,
			Model model) {
		double res;
		switch(opt) {
		case "add" -> res=calciService.add(num1, num2);
		case "sub" -> res=calciService.sub(num1, num2);
		case "mul" -> res=calciService.mul(num1, num2);
		case "div" -> res=calciService.div(num1, num2);
		case "mod" -> res=calciService.div(num1, num2);
		default -> {
			model.addAttribute("errmsg", "Invalid operation");
			return "result";
		} 
		}
		System.out.println("Result is " + res);
		model.addAttribute("res",res);
		model.addAttribute("operation", opt);
		return "result";
	}
}
