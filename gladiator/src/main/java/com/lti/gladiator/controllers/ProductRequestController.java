package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.services.ProductRequestServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admins")
public class ProductRequestController {

	@Autowired
	ProductRequestServiceImpl prodReqService;
	
	@GetMapping("/")
	public List<ProductRequest> getAllProductRequests() {

		return prodReqService.getAllProductRequests();
	}
	
	@PostMapping("/")
	public boolean addProductRequest(ProductRequest prodReq) {

		return prodReqService.addProductRequest(prodReq);
	}

	@PutMapping("/{prodReqId}")
	public boolean updateProductRequest(@PathVariable("prodReqId") int prodReqId) {

		return prodReqService.updateProductRequest(prodReqId);
	}
	
}
