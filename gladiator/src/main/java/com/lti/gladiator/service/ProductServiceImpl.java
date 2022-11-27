package com.lti.gladiator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.gladiator.beans.Product;
import com.lti.gladiator.dao.ProductDao;

public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao dao;
	@Override
	public List<Product> findProductByName(String productName) {
		// TODO Auto-generated method stub
		List<Product> p = dao.findProductByName(productName);
		return p;
	}

	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		Product p = dao.findProduct(productId);
		return p;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> p = dao.getAllProducts();
		return p;
	}

}
