package com.quizcomm.bo;

import org.springframework.beans.factory.annotation.Autowired;

import com.quizcomm.dao.UserDao;
import com.quizcomm.dom.User;

public class UserBoImpl implements UserBo {
	
	
	@Autowired
	private UserDao userDao;
	
	
	public void addUser(User user) {
		userDao.addUser(user);
	}

	public User getUser(String userId) {
		return userDao.getUser(userId);
	}

	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	

	
}
