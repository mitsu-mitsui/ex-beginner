package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String input(@Validated UserForm form,BindingResult result ,Model model,RedirectAttributes redirectAttributes){
		
		if(result.hasErrors()) {
			return index();
		}
		
		User user = new User();
		
		user.setAge(form.getAge());
		user.setName(form.getName());
		user.setComment(form.getComment());

		model.addAttribute("user", user);
		
		return "exam04-result";
	}
}
