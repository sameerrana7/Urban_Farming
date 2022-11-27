package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.gladiator.beans.user;
import com.lti.gladiator.dao.userDao;

@Service("uesrService")
public class userServiceImpl implements userService {

	@Autowired
	userDao dao;

	@Override
	public boolean addUser(user e) {
		System.out.println("Service layer");
		if (dao.createUser(e)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public user search(int eid) {
		user e2 = dao.findUserById(eid);
		return e2;
	}

	@Override
	public user modifyUser(user e) {
		user e3 = dao.updateUser(e);
		return e3;
	}

	@Override
	public boolean removeUser(user e) {
		if (dao.deleteUser(e)) {
			return true;
		} else {
			return false;
		}
	}

}
