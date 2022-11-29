package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.Retailer;

public interface AdminDao {
	
	public Admin adminLogin(Login login);
	public int addRetailer(Retailer retailer);
	public int addProduct(Product p);
	public List<ProductRequest> getAllProductRequests();
	public Product updateProduct(Product p);
	public boolean approveRequest(ProductRequest prodReq, int adminId);
}
