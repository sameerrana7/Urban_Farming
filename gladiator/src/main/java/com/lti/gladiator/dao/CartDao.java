package com.lti.gladiator.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.gladiator.beans.OrderDTO;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductListObject;

public interface CartDao {
	
	public boolean generateOrder(int userId, int prodId, String timeStamp);
	
//    public int 	addToCart(int prodId);
//    public boolean deleteProduct(int prodId,int userId);
//    public boolean resetCart(int userId);
//    public int 	setProductQuantity();
	
	
	
    
    
}
	
    
	