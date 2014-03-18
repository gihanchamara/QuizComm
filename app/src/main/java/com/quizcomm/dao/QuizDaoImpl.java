package com.quizcomm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quizcomm.dom.Quiz;

@Repository
public class QuizDaoImpl implements QuizDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void createQuiz(Quiz quiz) {
		getCurrentSession().save(quiz);
	}
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	

}
