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

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Override
	public Admin adminLogin(Login login) {

		return adminDao.adminLogin(login);
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
	public boolean approveReq(ProductRequest id) {

		return adminDao.approveReq(id);
	}

	

	

}
