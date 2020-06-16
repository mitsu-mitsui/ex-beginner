package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex2")
public class Exam02Controller {

	@RequestMapping("")
	public String index() {
		return "exam02" ;
	}
	
}
