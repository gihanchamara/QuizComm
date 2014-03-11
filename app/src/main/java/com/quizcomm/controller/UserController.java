package com.quizcomm.controller;

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
public class UserController {
	
	@Autowired
	private UserBo userBo;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String defaultPage(ModelMap model) {

		
		User user = new User();
		user.setName("NameTest");
		user.setUserId("userID");
		user.setStatus(5);
		
		model.addAttribute("user", user);

		return "user";
	}
	
	@RequestMapping(value="/member/user/{userId}",method=RequestMethod.GET)
	public String getUser(@PathVariable String userId, ModelMap model) {
		
		model.addAttribute("user", userBo.getUser(userId));

		return "user";
	}
	
	@RequestMapping(value = "/member/user/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("user")
	User user, BindingResult result) {
		user.setStatus(0);
		userBo.addUser(user);
		return "redirect:/user";
	}
}
