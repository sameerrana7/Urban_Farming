package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.AdminException;

public interface AdminService {

	public Admin adminLogin(String email, String password) throws AdminException;
	public int addRetailer(Retailer retailer);
	public int addProduct(ProductDTO p);
	//public boolean removeRetailer(int id);
	public List<ProductRequest> getAllProductRequests();
	public boolean approveRequest(int prodReqDTOId, int adminId);
	public List<Retailer> getAllRetailers();
	public Admin getAdmin(int adminId) throws AdminException;
	
}
