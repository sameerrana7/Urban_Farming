package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.dao.UserDao;

@Service("uesrService")
public class UserServiceImpl implements UserService {

//	@Autowired
	UserDao dao;

	@Override
	public boolean addUser(User e) {
		System.out.println("Service layer");
		if (dao.createUser(e)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User search(int eid) {
		User e2 = dao.findUserById(eid);
		return e2;
	}

	@Override
	public User modifyUser(User e) {
		User e3 = dao.updateUser(e);
		return e3;
	}

	@Override
	public boolean removeUser(User e) {
		if (dao.deleteUser(e)) {
			return true;
		} else {
			return false;
		}
	}
}
