package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.ProductException;
import com.lti.gladiator.exceptions.RetailerException;
import com.lti.gladiator.services.RetailerServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/retailers")
public class RetailerController {

	@Autowired
	RetailerServiceImpl retailerService;

	// http://localhost:8282/retailers//login/{email}/{password}

	@GetMapping(path = "/login/{email}/{password}")
	public Retailer retailerLogin(@PathVariable("email") String email, @PathVariable("password") String password)
			throws RetailerException {
		System.out.println("login");
		return retailerService.RetailerLogin(email, password);
	}

	// http://localhost:8282/retailers/findproduct/101
	@GetMapping("/findproduct/{productid}")
	public Product findProduct(@PathVariable("productid") int productId) throws ProductException {
		System.out.println(retailerService.findProduct(productId));
		return retailerService.findProduct(productId);
	}

	// http://localhost:8282/retailers/updaterequest/101
	@PutMapping(path = "/updaterequest/{productid}")
	public boolean createUpdateRequest(@PathVariable("productid") int productid, @RequestBody Product p) {

		return retailerService.createUpdateRequest(productid, p);
	}

	// http://localhost:8282/retailers/myproducts/{retailerid}
	@GetMapping(path = "/myproducts/{retailerid}")
	public List<Product> showMyProducts(@PathVariable("retailerid") int retailerId) {
		return retailerService.showMyProducts(retailerId);
	}

}
