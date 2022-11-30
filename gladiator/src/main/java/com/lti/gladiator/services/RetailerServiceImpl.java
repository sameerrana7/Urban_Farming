package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.dao.RetailerDao;

@Service("retailerService")
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	RetailerDao retailerDao;

	@Override
	public Retailer RetailerLogin(String email, String password) {
		return retailerDao.RetailerLogin(email, password);
	}

	@Override
	public Product findProduct(int productId) {
		Product p = retailerDao.findProduct(productId);
		return p;
	}

	@Override
	public boolean createUpdateRequest(int productId, Product p) {
		boolean req = retailerDao.createUpdateRequest(productId, p);
		return req;
	}

	@Override
	public List<Product> showMyProducts(int retailerId) {
		List<Product> productList = retailerDao.showMyProducts(retailerId);
		return productList;
	}

}
