package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.gladiator.beans.Cart;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.dao.ProductDao;
import com.lti.gladiator.exceptions.ProductException;

@Component
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

	@Override
	public int addToCart(Cart c) {
		// TODO Auto-generated method stub
		int cartId = dao.addToCart(c);
		return cartId;
	}

	

}
