package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex2")
public class Exam02Controller {

	@RequestMapping("")
	public String index() {
		return "exam02" ;
	}
	
	@RequestMapping("/input")
	public String input(Integer n1,Integer n2 ,Model model) {
		
		int sum = n1+n2;
		model.addAttribute("n1", n1);
		model.addAttribute("n2",n2);
		model.addAttribute("sum",sum);
		
		return "exam02-result";
	}
	
}
