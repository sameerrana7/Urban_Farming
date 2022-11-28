package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.services.AdminServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	AdminServiceImpl adminService;
	
	@GetMapping("/login")
	public Admin adminLogin(@RequestBody Login login) {
		
		System.out.println("inside login controller");
		
		return adminService.adminLogin(login);
	}
	
	@PostMapping("/retailer")
	public int addRetailer(@RequestBody Retailer retailer)
	{
		return adminService.addRetailer(retailer);
	}
	
	@PostMapping("/product")
	public int addProduct(@RequestBody Product p) {

		return adminService.addProduct(p);
	}
	
	@GetMapping("/productrequests")    // need to test, not able to add productRequest records using oracle express
	public List<ProductRequest> getAllProductRequests() {

		return adminService.getAllProductRequests();
	}

//	@PutMapping("/")
	public boolean approveRequest(@RequestBody ProductRequest prodReq) {

		return adminService.approveRequest(prodReq);
	}

}
