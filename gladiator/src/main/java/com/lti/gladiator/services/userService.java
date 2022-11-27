package com.lti.gladiator.services;

import com.lti.gladiator.beans.user;

public interface userService {
	public boolean addUser(user e);
	public user search(int eid);
	public user modifyUser(user e);
	public boolean removeUser(user e);
}
