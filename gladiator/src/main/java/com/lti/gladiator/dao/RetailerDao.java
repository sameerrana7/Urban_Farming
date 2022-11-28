package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;

public interface RetailerDao {

	public int getRetailerLogin(Login login);

	public Product findProduct(int productId);

	public boolean createUpdateRequest(int productId, Product p);

	public List<Product> showMyProducts(int retailerId);

	// Revenue

//	public int addProduct(Product p);
//	public List<Product> findProductByName(String Product);

}
