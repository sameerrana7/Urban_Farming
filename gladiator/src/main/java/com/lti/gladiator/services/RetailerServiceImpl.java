package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.dao.RetailerDao;
import com.lti.gladiator.exceptions.RetailerException;

@Service("retailerService")
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	RetailerDao retailerDao;

	@Override
	public Retailer RetailerLogin(String email, String password) throws RetailerException {
		return retailerDao.RetailerLogin(email, password);
	}

	@Override
	public Product findProduct(int productId) {
		Product p = retailerDao.findProduct(productId);
		return p;
	}

	@Override
	public int createUpdateRequest(ProductRequestDTO r) {
		int productRequestId = retailerDao.createUpdateRequest(r);
		return productRequestId;
	}

	@Override
	public List<Product> showMyProducts(int retailerId) {
		List<Product> productList = retailerDao.showMyProducts(retailerId);
		return productList;
	}
	
	@Override
	public Retailer findRetailer(int retailerId) throws RetailerException {

		return retailerDao.findRetailer(retailerId);
	}

}
