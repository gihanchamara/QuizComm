package com.quizcomm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quizcomm.bo.UserBo;
import com.quizcomm.dom.User;

@Controller
public class UserController {
	
	@Autowired
	private UserBo userBo;
	
	@RequestMapping("/user")
	public String listContacts(Map<String, Object> map) {

		map.put("user", new User());
		//map.put("userList", contactService.listContact());

		return "user";
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("user")
	User user, BindingResult result) {
		user.setStatus(0);
		userBo.addUser(user);
		return "redirect:/user";
	}
}
