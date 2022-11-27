package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.services.AdminServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	AdminServiceImpl adminService;
	
//	@GetMapping("/{}")
	public boolean adminLogin(String adminEmail, String adminPassword) {
		
		return adminService.adminLogin(adminEmail, adminPassword);
	}
	
	@GetMapping("/")
	public List<ProductRequest> getAllProductRequests() {

		return adminService.getAllProductRequests();
	}

	@PutMapping("/")
	public boolean approveReq(ProductRequest id) {

		return adminService.approveReq(id);
	}

}
