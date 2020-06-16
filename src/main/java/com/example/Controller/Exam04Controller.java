package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex4")
public class Exam04Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/input")
	public String input()
	{
		return "exam04-result";
	}
}
