package com.lti.gladiator.services;

public interface CartService {
	
	public int addToCart(int userId, int prodId);
	
	boolean deleteCartBycartId(int cartId);

	boolean deleteCartByuserId(int userId);

	

}
