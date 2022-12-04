package com.lti.gladiator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gladiator.beans.OrderDTO;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductListObject;
import com.lti.gladiator.dao.CartDao;

@Service("CartService")
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	CartDao dao;

	public boolean generateOrder(int userId, int prodId, String timeStamp){
		
		return dao.generateOrder(userId, prodId, timeStamp);
	}

}
