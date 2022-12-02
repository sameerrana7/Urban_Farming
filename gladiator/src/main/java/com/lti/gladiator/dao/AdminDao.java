package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.AdminException;

public interface AdminDao {
	
	public Admin adminLogin(String email, String password) throws AdminException;
	public int addRetailer(Retailer retailer);
	public int addProduct(ProductDTO p);
	public List<ProductRequest> getAllProductRequests();
	public Product updateProduct(Product p);
	public boolean approveRequest(int prodReqDTOId, int adminId);
	public List<Retailer> getAllRetailers();
}
