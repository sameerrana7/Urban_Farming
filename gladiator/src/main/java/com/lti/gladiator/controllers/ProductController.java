package com.lti.gladiator.controllers;

import java.util.ArrayList;
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
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.services.ProductService;
import com.lti.gladiator.services.ProductServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
//	public Product findProductByNo(int productId)
//	{
//		return productService.findProduct(productId);
//	}
	
	//http://localhost:8282/products/productsbyname/pname
	@GetMapping("/productsbyname/{pname}")
	public List<ProductDTO> findAllByName(@PathVariable("pname")String productName)
	{
		List<Product> pdList = productService.findProductByName(productName);
		List<ProductDTO> pList = new ArrayList<>();
		ProductDTO dto;
		for(Product product : pdList)
		{
			dto = new ProductDTO();
			
			dto.productId = product.getProductId();
			dto.productName = product.getProductName();
			dto.productImage = product.getProductImage();
			dto.productDesc = product.getProductDesc();
			dto.productPrice = product.getProductPrice();
			dto.productBrand = product.getProductBrand();
			dto.productQty = product.getProductQty();
			dto.categoryId = product.getCategory().getCategoryId();
			dto.retailerId = product.getRetailer().getRetailerId();
			pList.add(dto);
		}
		return pList;
	}
	//http://localhost:8282/products/allproducts
	@GetMapping("/allproducts")
	public List<ProductDTO> findAll()
	{
		List<Product> pdList = productService.getAllProducts();
		List<ProductDTO> pList = new ArrayList<>();
		ProductDTO dto;
		for(Product product : pdList)
		{
			dto = new ProductDTO();
			
			dto.productId = product.getProductId();
			dto.productName = product.getProductName();
			dto.productImage = product.getProductImage();
			dto.productDesc = product.getProductDesc();
			dto.productPrice = product.getProductPrice();
			dto.productBrand = product.getProductBrand();
			dto.productQty = product.getProductQty();
			dto.categoryId = product.getCategory().getCategoryId();
			dto.retailerId = product.getRetailer().getRetailerId();
			pList.add(dto);
		}
		return pList;
	}
	

	
	
	
}
