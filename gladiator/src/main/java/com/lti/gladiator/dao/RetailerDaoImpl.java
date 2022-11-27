package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RetailerDaoImpl implements RetailerDao {

	@PersistenceContext
	private EntityManager em;

	public boolean getRetailerLogin(String mail, String password) {
		return false;
	}

	@Override
	public int addProduct(Product p) {
		em.persist(p);
		return p.getProductId();
	}

	@Override
	public Product findProduct(int productId) {
		return null;
	}

	@Override
	public List<Product> findProductByName(String Product) {
		return null;
	}

	@Override
	public boolean updateProduct(int productId, Product p) {
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		return null;
	}

}
