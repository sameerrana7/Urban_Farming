package com.lti.gladiator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.services.CartServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartServiceImpl cartservice;
	
	
	public int getProductQuantity() {
		// TODO Auto-generated method stub
		return cartservice.getProductQuantity();
	}

	public boolean deleteProduct() {
		// TODO Auto-generated method stub
		return cartservice.deleteProduct();
	}

	public boolean resetCart() {
		// TODO Auto-generated method stub
		return cartservice.resetCart();
	}
	
	
	
	

}
