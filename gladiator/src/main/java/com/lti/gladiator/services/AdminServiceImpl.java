package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.dao.AdminDao;

public class AdminServiceImpl implements AdminService {

	AdminDao dao;
	
	@Override
	public boolean adminLogin(String adminEmail, String adminPassword) {

		return dao.adminLogin(adminEmail, adminPassword);
	}

	@Override
	public List<ProductRequest> getAllProductRequests() {

		return dao.getAllProductRequests();
	}

	@Override
	public boolean approveReq(ProductRequest id) {

		return dao.approveReq(id);
	}

}
