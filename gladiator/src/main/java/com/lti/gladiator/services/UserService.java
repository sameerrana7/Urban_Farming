package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Order;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.exceptions.UserException;

public interface UserService {
	public boolean addUser(User e);
	public User search(int eid);
	public User modifyUser(User e);
	public boolean removeUser(User e);
	public List<Order> getAllOrders(int userId);
	public User userLogin(String email,String password) throws UserException;
}
