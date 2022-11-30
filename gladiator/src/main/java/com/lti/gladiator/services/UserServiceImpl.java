package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Order;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.dao.UserDao;
import com.lti.gladiator.dao.UserDaoImpl;
import com.lti.gladiator.exceptions.UserException;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
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

	@Override
	public List<Order> getAllOrders(int userId) {
		// TODO Auto-generated method stub
		return dao.getAllOrders(userId);
	}

	@Override
	public User userLogin(String email, String password) throws UserException {
		User login1 = dao.userLogin(email, password);
		return login1;
	}
}
