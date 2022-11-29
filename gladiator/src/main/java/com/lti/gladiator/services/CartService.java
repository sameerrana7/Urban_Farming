package com.lti.gladiator.services;

public interface CartService {
	
	public int 	addToCart(int prodId);
    public boolean deleteProduct(int prodId,int userId);
    public boolean resetCart(int userId);
    public int 	setProductQuantity();
	
	

}
