package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;

public interface RetailerService {

	public Retailer getRetailerLogin(Login login);

	public Product findProduct(int productId);

	public boolean createUpdateRequest(int productId, Product p);

	public List<Product> showMyProducts(int retailerId);

	// Revenue

}
