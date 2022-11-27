package com.lti.gladiator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Product;
import com.lti.gladiator.service.ProductServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	
	public Product findProductByNo(int productId)
	{
		return productService.findProduct(productId);
	}
	
	public List<Product> findAllByName(String productName)
	{
		return productService.findProductByName(productName);
	}
	
	
	
	public List<Product> findAll()
	{
		return productService.getAllProducts();
	}
	
	
	
}
