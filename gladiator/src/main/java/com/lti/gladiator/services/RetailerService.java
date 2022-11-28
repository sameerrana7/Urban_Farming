package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;

public interface RetailerService {

	public int getRetailerLogin(Login login);

	public Product findProduct(int productId);

	public boolean createUpdateRequest(int productId, Product p);

	public List<Product> showMyProducts(int retailerId);

	// Revenue

}
