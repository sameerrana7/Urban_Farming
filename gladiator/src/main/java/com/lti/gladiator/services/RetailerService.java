package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.RetailerException;

public interface RetailerService {

	public Retailer RetailerLogin(String email, String password) throws RetailerException;

	public Product findProduct(int productId);

	public int createUpdateRequest(ProductRequestDTO r);

	public List<Product> showMyProducts(int retailerId);

	public Retailer findRetailer(int retailerId) throws RetailerException;

	// Revenue

}
