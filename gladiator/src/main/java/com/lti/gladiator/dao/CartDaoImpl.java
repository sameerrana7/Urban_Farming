package com.lti.gladiator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Cart;
import com.lti.gladiator.beans.Order;
import com.lti.gladiator.beans.OrderDTO;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductListObject;
import com.lti.gladiator.beans.User;

@Repository
public class CartDaoImpl implements CartDao{
	
	@PersistenceContext
    private EntityManager em;

	@Override
	@Transactional
	public boolean generateOrder(int userId, int prodId, String timeStamp) {

		try {
			Order order = new Order();
			
			//fetch the user
			User user = em.find(User.class, userId);
			
			//fetch the product
			Product prod = em.find(Product.class, prodId);
			
			order.setUser(user);
			
			prod.setProductQty(prod.getProductQty()-1);
			em.merge(prod); // changing stock value
			
			order.setProduct(prod);
			
			order.setProductOrderQty(1);
			
			order.setProductOrderPrice(prod.getProductPrice());
			
			order.setTimeStamp(timeStamp);
			
			em.persist(order);
			
			return true;
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
	}

//	public boolean generateOrder(ProductListObject prodListObj, int userId, String timeStamp) {
//		
//		System.out.println("Inside cart DAO Impl : "+ prodListObj);
//		
//		User user = em.find(User.class, userId);
//		
//		List<Order> orderList = new ArrayList<>();
//		
//		Order order;
//		
//		Product prodToBeAdded;
//		
//		for(int prodId: prodListObj.getProdIdList() )
//		{
//			order = new Order();
//			
//			order.setUser(user);
//			
//			// make the prod in managed state and then set it
//			prodToBeAdded = em.find(Product.class, prodId);
//			
//			//decrement the qty of stock from DB
//			prodToBeAdded.setProductQty(prodToBeAdded.getProductQty()-1);
//			//reflect updated prod in db
//			em.merge(prodToBeAdded);
//			
//			order.setProduct(prodToBeAdded);
//			
//			order.setProductOrderQty(1);
//			
//			order.setProductOrderPrice(prodToBeAdded.getProductPrice());
//			
//			order.setTimeStamp(timeStamp);
//			
//			em.persist(order);
//		}
//		
//		return true;
//	}
	
	

}
