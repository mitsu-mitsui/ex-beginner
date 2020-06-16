package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex2")
public class Exam02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02" ;
	}
	
	@RequestMapping("/input")
	public String input(Integer n1,Integer n2 ) {
		
		int sum = n1+n2;
		session.setAttribute("n1", n1);
		session.setAttribute("n2",n2);
		session.setAttribute("sum",sum);
		
		return "exam02-result";
	}
	
	
	
}
