package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.ProductRequest;

public interface AdminDao {
	
	public boolean adminLogin(String adminEmail, String adminPassword);
	//public boolean addRetailer(Retailer retailer);
	//public boolean removeRetailer(int id);
	public List<ProductRequest> getAllProductRequests();
	public boolean approveReq(ProductRequest id);
}
