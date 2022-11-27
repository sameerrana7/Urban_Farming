package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.ProductRequest;

public interface ProductRequestDao {

	public List<ProductRequest> getAllProductRequests();
	public boolean addProductRequest(ProductRequest prodReq);
	public boolean updateProductRequest(int prodReqId);
	
}
