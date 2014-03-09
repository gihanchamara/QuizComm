package com.quizcomm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quizcomm.dom.User;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addUser(User user) {
		getCurrentSession().save(user);
	}
	
	@Transactional
	public User getUser(String userId) {
		return (User)getCurrentSession().get(User.class,userId);
	}
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	
	

}
