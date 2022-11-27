package com.lti.gladiator.dao;

public interface CartDao {
	
    public int findaddToCart(int userId, int prodId);
	
	boolean finddeleteCartBycartId(int cartId);

	boolean finddeleteCartByuserId(int userId);

}
	
    
	