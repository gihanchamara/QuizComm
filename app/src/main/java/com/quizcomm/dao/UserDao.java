package com.quizcomm.dao;

import com.quizcomm.dom.User;

public interface UserDao {
	
	public void addUser(User user);
	public User getUser(String userId);

}
