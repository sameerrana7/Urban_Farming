package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Cart;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.services.ProductService;
import com.lti.gladiator.services.ProductServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	public Product findProductByNo(int productId)
	{
		return productService.findProduct(productId);
	}
	
	
	//http://localhost:8282/products/productsbyname/pname
	@GetMapping("/productsbyname/{pname}")
	public List<Product> findAllByName(@PathVariable("pname")String productName)
	{
		return productService.findProductByName(productName);
	}
	
	
	//http://localhost:8282/products/allproducts
	@GetMapping("/allproducts")
	public List<Product> findAll()
	{
		return productService.getAllProducts();
	}
	
	
	//http://localhost:8282/products/cart
	@PostMapping("/cart")
	public int addToCart(@RequestBody Cart c)
	{
		return productService.addToCart(c);
	}
	
	
	
}
