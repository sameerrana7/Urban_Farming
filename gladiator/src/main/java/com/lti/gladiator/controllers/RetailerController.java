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
import com.lti.gladiator.services.RetailerServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/retailers")
public class RetailerController {

	@Autowired
	RetailerServiceImpl retailerService;

	@PostMapping(path = "/retailerlogin")
	public boolean retailerLogin(@RequestBody Login login) {
		return retailerService.getRetailerLogin(login.getMail(), login.getPassword());
	}

	@PostMapping(path = "/addProduct")
	public int addProduct(@RequestBody Product p) {
		return productService.addProduct(p);
	}

	@GetMapping("/findproduct/{pid}")
	public Product findProduct(@PathVariable("pid") int productId) {
		return productService.findProduct(productId);
	}

	@PutMapping(path = "/updateemp/{pid}")
	public boolean updateProduct(@PathVariable("pid") int pid, @RequestBody Product p) {

		return productService.updateProduct(pid, p);
	}

	@GetMapping(path = "/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

}
