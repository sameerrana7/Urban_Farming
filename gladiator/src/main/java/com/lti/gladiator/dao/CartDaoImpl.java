package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Cart;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.User;

@Repository
public class CartDaoImpl implements CartDao{
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public int addToCart(int prodId) {
		//Product p = em.find(Product.class,prodId);
		em.persist(prodId);
		return 0;
	}

	@Override
	public boolean deleteProduct(int prodId,int userId) { 
		
		TypedQuery tqry = em.createQuery( "delete e from Cart e where e.userId=:userId and e.prodId=:prodId",Cart.class);
		
        tqry.setParameter("userId", userId);
        tqry.setParameter("prodId", prodId);
        int result = (int) tqry.getSingleResult();
        if (result>1) {
        	System.out.println("deleteProduct by prodId or userId");
        }
        else {
		return true;
        }
		return false;
	}
	@Override
	public boolean resetCart(int userId) {
		TypedQuery tqry = em.createQuery( "delete e from Cart e where e.userId=:userId",Cart.class);
		tqry.setParameter("userId", userId);
		int result = (int) tqry.getSingleResult();
        if (result>1) {
        	System.out.println("resetCart by userId");
        }
        else {
        	return true;
        }
		return false;
		
	}

	@Override
	public int setProductQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
	

}
