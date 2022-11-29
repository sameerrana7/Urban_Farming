package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.services.RetailerServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/retailers")
public class RetailerController {

	@Autowired
	RetailerServiceImpl retailerService;

	// http://localhost:8282/retailers/retailerlogin

	@GetMapping(path = "/retailerlogin")
	public Retailer retailerLogin(@RequestBody Login login) {
		System.out.println("login");
		return retailerService.getRetailerLogin(login);
	}

	// http://localhost:8282/retailers/findproduct/101
	@GetMapping("/findproduct/{pid}")
	public Product findProduct(@PathVariable("pid") int productId) {
		return retailerService.findProduct(productId);
	}

	@PutMapping(path = "/updaterequest/{pid}")
	public boolean createUpdateRequest(@PathVariable("pid") int pid, @RequestBody Product p) {

		return retailerService.createUpdateRequest(pid, p);
	}

	// http://localhost:8282/retailers/retailer
	@GetMapping(path = "/myproducts")
	public List<Product> showMyProducts(int retailerId) {
		return retailerService.showMyProducts(retailerId);
	}

}
