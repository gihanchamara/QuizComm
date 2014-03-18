package com.quizcomm.bo;

import org.springframework.beans.factory.annotation.Autowired;

import com.quizcomm.dao.QuizDao;
import com.quizcomm.dom.Quiz;

public class QuizBoImpl implements QuizBo {
	
	@Autowired
	private QuizDao quizDao;

	
	public void createQuiz(Quiz quiz) {
		quizDao.createQuiz(quiz);		
	}

}
