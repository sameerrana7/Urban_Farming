package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.OrderDTO;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductListObject;
import com.lti.gladiator.services.CartServiceImpl;
import com.lti.gladiator.services.OrderServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartServiceImpl cartService;
	
	//http://localhost:8282/cart/generateorder/1/2-12-22-15:14
	@PostMapping("/generateorder/{userId}/{prodId}/{timeStamp}")
	public boolean generateOrder(@PathVariable("userId") int userId, @PathVariable("prodId") int prodId ,@PathVariable("timeStamp") String timeStamp) {
		System.out.println("inside cart controller: ");
		return cartService.generateOrder(userId, prodId, timeStamp);
	}
	
	
    
	
//	public int setProductQuantity() {
//		// TODO Auto-generated method stub
//		return cartservice.setProductQuantity();
//	}
	
	

}
