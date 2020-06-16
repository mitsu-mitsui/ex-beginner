package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("ex1")
public class Exam01Controller {
	
	@RequestMapping("")
	public String index() {
		
		return "exam01";
	}
}
