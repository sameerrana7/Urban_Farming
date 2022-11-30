package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;

public interface RetailerService {

	public Retailer RetailerLogin(String email, String password);

	public Product findProduct(int productId);

	public boolean createUpdateRequest(int productId, Product p);

	public List<Product> showMyProducts(int retailerId);

	// Revenue

}
