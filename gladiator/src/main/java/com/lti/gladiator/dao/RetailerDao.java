package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Product;

public interface RetailerDao {

	public boolean getRetailerLogin(String mail, String password);

	public int addProduct(Product p);

	public Product findProduct(int productId);

	public List<Product> findProductByName(String Product);

	public boolean updateProduct(int productId, Product p);

	public List<Product> showMyProducts();

	// Revenue

}
