package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Cart;
import com.lti.gladiator.beans.Product;

public interface ProductDao {
	List<Product> findProductByName(String productName);
	Product findProduct(int productId);
	
	List<Product> getAllProducts();
	public int addToCart(Cart c);
}
