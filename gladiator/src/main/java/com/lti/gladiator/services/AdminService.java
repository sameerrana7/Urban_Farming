package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.Retailer;

public interface AdminService {

	public Admin adminLogin(Login login);
	public int addRetailer(Retailer retailer);
	public int addProduct(Product p);
	//public boolean removeRetailer(int id);
	public List<ProductRequest> getAllProductRequests();
	public boolean approveRequest(ProductRequest prodReq, int adminId);
	
}
