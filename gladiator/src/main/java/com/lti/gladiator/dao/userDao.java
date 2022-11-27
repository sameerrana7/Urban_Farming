package com.lti.gladiator.dao;

import com.lti.gladiator.beans.user;

public interface userDao {
	public boolean createUser(user e);
	public user findUserById(int userid);
	public user updateUser(user e);
	public boolean deleteUser(user e);
}
