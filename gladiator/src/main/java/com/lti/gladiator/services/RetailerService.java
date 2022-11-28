package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Product;

public interface RetailerService {

	public boolean getRetailerLogin(String retailerMail, String password);

	public int addProduct(Product p);

	Product findProduct(int productId);

	boolean updateProduct(int productId, Product p);

	List<Product> showMyProducts();

	// Revenue

}
