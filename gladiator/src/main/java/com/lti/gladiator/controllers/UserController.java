package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Order;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.exceptions.UserException;
import com.lti.gladiator.services.UserService;
import com.lti.gladiator.services.UserServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserServiceImpl userService;

	// http://localhost:8282/users/adduser
	@PostMapping("/adduser")
	public boolean addUser(@RequestBody User e) throws UserException {
		return userService.addUser(e);

	}

//	@GetMapping
	public User search(int eid) {
		User e2 = userService.search(eid);
		return e2;
	}

//	@GetMapping
	public User modifyUser(User e) {
		User e3 = userService.modifyUser(e);
		return e3;
	}
	
//	@GetMapping
	public boolean removeUser(User e) {
		if (userService.removeUser(e)) {
			return true;
		} else {
			return false;
		}
	}
	
	// http://localhost:8282/users/orders
	@GetMapping("/orders/{userId}")
	public List<Order> getAllOrders(@PathVariable("userId") int userId) {
		return userService.getAllOrders(userId);
	}
	
	// http://localhost:8282/users/login
	@GetMapping("/login")
	public User userLogin(@RequestBody Login login) {
		// TODO Auto-generated method stub
		System.out.println("inside login controller");
		return userService.userLogin(login);
	}

}
