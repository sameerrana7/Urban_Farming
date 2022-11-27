package com.lti.gladiator.service;

import java.util.List;

import com.lti.gladiator.beans.Product;

public interface ProductService {
	List<Product> findProductByName(String productName);
	Product findProduct(int productId);
	List<Product> getAllProducts();
}
