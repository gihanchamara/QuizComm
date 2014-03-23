package com.quizcomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.quizcomm.bo.QuizBo;
import com.quizcomm.bo.UserBo;
import com.quizcomm.dom.Quiz;
import com.quizcomm.dom.User;


@Controller
@RequestMapping(value="/quiz")
public class QuizController {
	
	
	@Autowired
	private QuizBo quizBo;
	
	@Autowired
	private UserBo userBo;
	
	@RequestMapping(value="/createQuiz",method=RequestMethod.GET)
	public String loadCreateQuizPage(){
		return "createQuiz";
	}
	
	
	@RequestMapping(value="/createQuizNew",method=RequestMethod.GET)
	public String loadCreateQuizNewPage(){
		return "createQuizNew";
	}
	
	@RequestMapping(value="/createQuizJson",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public  @ResponseBody Quiz createQuizJson(@RequestBody Quiz quiz){
		if(quiz!=null){
			User user = new User();
			user.setId(1L);
			quiz.setOwner(user);
		}
		quizBo.createQuiz(quiz);
		
		return quiz;
	}

}
