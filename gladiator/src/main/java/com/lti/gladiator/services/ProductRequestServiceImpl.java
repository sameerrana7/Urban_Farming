package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.dao.ProductRequestDao;

public class ProductRequestServiceImpl implements ProductRequestService {

	ProductRequestDao dao;
	
	@Override
	public List<ProductRequest> getAllProductRequests() {

		return dao.getAllProductRequests();
	}
	
	@Override
	public boolean addProductRequest(ProductRequest prodReq) {

		return dao.addProductRequest(prodReq);
	}

	@Override
	public boolean updateProductRequest(int prodReqId) {

		return dao.updateProductRequest(prodReqId);
	}

	

}
