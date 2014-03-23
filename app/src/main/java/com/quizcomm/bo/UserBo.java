package com.quizcomm.bo;

import com.quizcomm.dom.User;

public interface UserBo {
	
	public void addUser(User user);
	public User getUser(String userId);
	public User getUserByPK(Long id);
	public User getUserByUserId(String userId);

}
