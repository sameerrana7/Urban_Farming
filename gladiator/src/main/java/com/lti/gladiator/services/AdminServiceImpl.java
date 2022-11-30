package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.dao.AdminDao;
import com.lti.gladiator.exceptions.AdminException;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Override
	public Admin adminLogin(String email, String password) throws AdminException {

		return adminDao.adminLogin(email, password);
	}
	
	@Override
	public int addRetailer(Retailer retailer) {

		return adminDao.addRetailer(retailer);
	}

	@Override
	public int addProduct(Product p) {

		return adminDao.addProduct(p);
	}
	
	@Override
	public List<ProductRequest> getAllProductRequests() {

		return adminDao.getAllProductRequests();
	}

	@Override
	public boolean approveRequest(ProductRequest prodReq, int adminId) {

		return adminDao.approveRequest(prodReq, adminId);
	}

	

	

}
