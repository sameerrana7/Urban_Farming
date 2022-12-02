package com.lti.gladiator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.services.UserService;
import com.lti.gladiator.services.UserServiceImpl;

@SpringBootApplication
public class GladiatorApplication {

	public static void main(String[] args) {
		     SpringApplication.run(GladiatorApplication.class, args);

	}

}
