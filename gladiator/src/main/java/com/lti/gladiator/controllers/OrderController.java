package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.OrderDTO;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.services.OrderServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/order")
public class OrderController {

	
}
