package com.example.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex3")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/input")
	public String input(Integer item1,Integer item2,Integer item3) {
		
		int sum = item1+item2+item3;
		int sumplusTax =(int)(sum*1.1); 
		
		application.setAttribute("item1", item1);
		application.setAttribute("item2", item2);
		application.setAttribute("item3", item3);
		application.setAttribute("sum", sum);
		application.setAttribute("sumplusTax", sumplusTax);
		
		return "exam03-result";
	}
	
}
