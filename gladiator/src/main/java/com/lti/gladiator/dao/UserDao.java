package com.lti.gladiator.dao;

import com.lti.gladiator.beans.User;

public interface UserDao {
	public boolean createUser(User e);
	public User findUserById(int userid);
	public User updateUser(User e);
	public boolean deleteUser(User e);
}
