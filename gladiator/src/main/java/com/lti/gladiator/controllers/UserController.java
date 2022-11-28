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

import com.lti.gladiator.beans.User;
import com.lti.gladiator.exceptions.UserException;
import com.lti.gladiator.services.UserService;
import com.lti.gladiator.services.UserServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
//	@Autowired
	UserServiceImpl userService;

//	@PostMapping("/addUser")
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

}
