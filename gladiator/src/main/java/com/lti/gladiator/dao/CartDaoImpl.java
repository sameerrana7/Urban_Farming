package com.lti.gladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class CartDaoImpl implements CartDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public int findaddToCart(int userId, int prodId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean finddeleteCartBycartId(int cartId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean finddeleteCartByuserId(int userId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
