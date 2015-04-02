package com.team.cloudsharing.dao;

import com.team.cloudsharing.model.User;

public interface UserDAO {
	public void insert(User user);
	public User findByUserId(int userId);
	
}
