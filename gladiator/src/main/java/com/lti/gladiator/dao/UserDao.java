package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Order;
import com.lti.gladiator.beans.User;

public interface UserDao {
	public boolean createUser(User e);
	public User findUserById(int userid);
	public User updateUser(User e);
	public boolean deleteUser(User e);
	public List<Order> getAllOrders(int userId);
	public User userLogin(Login login);
}
