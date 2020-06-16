package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/ex4")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm() ;
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/input")
	public String input(UserForm form ,Model model){
		User user = new User();
		
		user.setAge(form.getAge());
		user.setName(form.getName());
		user.setComment(form.getComment());

		model.addAttribute("user", user);
		
		return "exam04-result";
	}
}
