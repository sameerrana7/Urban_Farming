package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.gladiator.dao.RetailerDao;

public class RetailerServiceImpl implements RetailerService {

	@Autowired
	RetailerDao dao;

	@Override
	public boolean getRetailerLogin(String retailerMail, String password) {
		return false;
	}

	@Override
	public int addProduct(Product p) {
		return 0;
	}

	@Override
	public Product findProduct(int productId) {
		return null;
	}

	@Override
	public boolean updateProduct(int productId, Product p) {
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		return null;
	}

}
