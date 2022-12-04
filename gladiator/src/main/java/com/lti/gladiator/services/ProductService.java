package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Cart;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.exceptions.ProductException;

public interface ProductService {
	List<Product> findProductByName(String productName);
	Product findProduct(int productId);
	List<Product> getAllProducts();
	public int addToCart(Cart c);
}
