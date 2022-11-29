package com.lti.gladiator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.gladiator.services.CartServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/cart")
public class CartController {
	
//	@Autowired
	CartServiceImpl cartservice;
	
	
	
    //http://localhost:8282/cart/addToCart
	@GetMapping("/addToCart/")
	public int addToCart(@PathVariable("pid")int prodId) {
		return cartservice.addToCart(prodId);
	}
    
	//http://localhost:8282/cart/deleteProduct
	@DeleteMapping("/delete/{pid}/{uid}")
	public boolean deleteProduct(@PathVariable("pid")int prodId,@PathVariable("uid")int userId) {
		return cartservice.deleteProduct(prodId,userId);
	}
    
	//http://localhost:8282/cart/resetCart
	@DeleteMapping("/delete/{pid}")
	public boolean resetCart(@PathVariable("uid")int userId) {
		return cartservice.resetCart(userId);
	}
	
	public int setProductQuantity() {
		// TODO Auto-generated method stub
		return cartservice.setProductQuantity();
	}
	
	
	
	
	

}
