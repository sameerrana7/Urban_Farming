package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.dao.CartDao;

@Service("CartService")
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	CartDao dao;
	
	
	
	
	
	
	//reset cart
	@Override
	public boolean deleteCartByuserId (int userId) {
		return dao.deleteCartByuserId(userId);
	}

	
	


}
