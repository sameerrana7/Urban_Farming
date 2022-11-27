package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.ProductRequest;

public interface ProductRequestService {

	public List<ProductRequest> getAllProductRequests();
	public boolean addProductRequest(ProductRequest prodReq);
	public boolean updateProductRequest(int prodReqId);
}
