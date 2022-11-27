package com.lti.gladiator.services;

import com.lti.gladiator.beans.User;

public interface UserService {
	public boolean addUser(User e);
	public User search(int eid);
	public User modifyUser(User e);
	public boolean removeUser(User e);
}
