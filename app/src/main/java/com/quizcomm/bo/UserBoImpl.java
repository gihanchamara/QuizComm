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

	public UserDao getUserFao() {
		return userDao;
	}

	public void setUserFao(UserDao userFao) {
		this.userDao = userFao;
	}

	
}
