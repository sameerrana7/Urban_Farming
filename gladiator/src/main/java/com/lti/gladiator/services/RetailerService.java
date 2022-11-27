package com.lti.gladiator.services;

public interface RetailerService {

	public boolean getRetailerLogin(String retailerMail, String password);

	public int addProduct(Product p);

	Product findProduct(int productId);

	boolean updateProduct(int productId, Product p);

	List<Product> getAllProducts();

	// Revenue

}
