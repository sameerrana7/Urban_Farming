package com.lti.gladiator.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.gladiator.beans.Product;

public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<Product> findProductByName(String productName) {
		// TODO Auto-generated method stub
		TypedQuery tqry = em.createQuery("Select e from Product e where e.productName = :productName",Product.class);
		tqry.setParameter("productName", productName);
		List<Product> proList = tqry.getResultList();
		return proList;
	}

	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		Product p = em.find(Product.class,productId);
		return p;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Query qry = em.createQuery("select e from Product e");
		List<Product> proList = qry.getResultList();
		return proList;
	}

}
