package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.dao.CartDao;

@Service("CartService")
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	CartDao dao;

	@Override
	public int getProductQuantity() {
		// TODO Auto-generated method stub
		return dao.getProductQuantity();
	}

	@Override
	public boolean deleteProduct() {
		// TODO Auto-generated method stub
		return dao.deleteProduct();
	}

	@Override
	public boolean resetCart() {
		// TODO Auto-generated method stub
		return dao.resetCart();
	}
	
	
	
	
	
	
	

	
	


}
