package com.quizcomm.controller;

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
	public String loginFailed(ModelMap model){
		model.addAttribute("failed", "failed");
		return "loginfailed";
	}

}
