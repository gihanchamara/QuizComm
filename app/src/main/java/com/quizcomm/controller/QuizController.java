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
	
	@RequestMapping(value="/createQuizJson",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public  @ResponseBody String createQuizJson(@RequestBody Quiz quiz){
		if(quiz!=null){
			quiz.setOwner(userBo.getUserByPK(1L));
		}
		quizBo.createQuiz(quiz);
		return "created";
	}

}
