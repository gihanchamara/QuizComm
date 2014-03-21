package com.quizcomm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String login(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value="/loginfailed")
	public String loginFailed(HttpSession session,ModelMap model){
		model.addAttribute("error", "true");
		session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
		return "login";
	}

}
