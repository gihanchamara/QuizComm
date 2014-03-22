package com.quizcomm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quizcomm.bo.UserBo;
import com.quizcomm.dom.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserBo userBo;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String defaultPage(ModelMap model) {

		return "redirect:/user/home";
	}
	
	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	public String getUser(@PathVariable String userId, ModelMap model) {
		
		model.addAttribute("user", userBo.getUser(userId));

		return "user";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("user")
	User user, BindingResult result) {
		user.setStatus("ACTIVE");
		userBo.addUser(user);
		return "redirect:/user";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String memberHome(HttpSession session,@ModelAttribute("user")
	User user, BindingResult result) {
		return "userHome";
	}
}
