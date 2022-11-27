package com.lti.gladiator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Order;
import com.lti.gladiator.services.OrderService;
import com.lti.gladiator.services.OrderServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/myorder")
public class OrderController {

	@Autowired
	OrderServiceImpl OrderService;

	@GetMapping(path = "/order")
	public Order generateorder() {
		return OrderService.generateOrder(orderId);
	}

}
