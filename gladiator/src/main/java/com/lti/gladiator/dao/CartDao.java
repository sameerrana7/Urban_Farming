package com.lti.gladiator.dao;

import com.lti.gladiator.beans.Product;

public interface CartDao {
	
    public int 	addToCart(int prodId);
    public boolean deleteProduct(int prodId,int userId);
    public boolean resetCart(int userId);
    public int 	setProductQuantity();
	
	
	
    
    
}
	
    
	