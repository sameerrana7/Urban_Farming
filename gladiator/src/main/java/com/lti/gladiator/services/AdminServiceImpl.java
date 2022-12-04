package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductDTO;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.ProductRequestDTO;
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
	public int addProduct(ProductDTO p) {

		return adminDao.addProduct(p);
	}
	
	@Override
	public List<ProductRequest> getAllProductRequests() {

		return adminDao.getAllProductRequests();
	}

	@Override
	public boolean approveRequest(int prodReqDTOId, int adminId) {

		return adminDao.approveRequest(prodReqDTOId, adminId);
	}

	@Override
	public List<Retailer> getAllRetailers() {

		return adminDao.getAllRetailers();
	}

	@Override
	public Admin getAdmin(int adminId) throws AdminException {
		
		return adminDao.getAdmin(adminId);
	}

	

}
