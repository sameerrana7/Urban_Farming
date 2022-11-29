package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.dao.CartDao;

@Service("CartService")
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	CartDao dao;

	@Override
	public int addToCart(int prodId) {
		//Product p = dao.getProductQuantity(prodId);
		return dao.addToCart(prodId);
	}

	@Override
	public boolean deleteProduct(int prodId,int userId) {
		
		return dao.deleteProduct(prodId,userId);
	}

	@Override
	public boolean resetCart(int userId) {
		
		return dao.resetCart(userId);
	}

	@Override
	public int setProductQuantity() {
		// TODO Auto-generated method stub
		return dao.setProductQuantity();
	}
	
	
	
	
	
	
	

	
	


}
