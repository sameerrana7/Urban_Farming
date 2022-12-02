package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.OrderDTO;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductListObject;

public interface CartService {
	
	public boolean generateOrder(int userId, int prodId, String timeStamp);
	
//	public int 	addToCart(int prodId);
//    public boolean deleteProduct(int prodId,int userId);
//    public boolean resetCart(int userId);
//    public int 	setProductQuantity();
	
	

}
