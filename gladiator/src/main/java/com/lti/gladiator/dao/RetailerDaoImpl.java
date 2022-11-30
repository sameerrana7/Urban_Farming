package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;

@Repository
public class RetailerDaoImpl implements RetailerDao {

	@PersistenceContext
	private EntityManager em;

	public Retailer RetailerLogin(String email, String password) {
		System.out.println("Retailer Login");
		TypedQuery loginretailer = em.createQuery(
				"Select r from Retailer r where r.retailerEmail = :retailerEmail and r.retailerPassword = :retailerPassword",
				Retailer.class);
		loginretailer.setParameter("retailerEmail", email);
		loginretailer.setParameter("retailerPassword", password);
		Retailer r = (Retailer) loginretailer.getSingleResult();
		return r;
	}

	@Override
	public Product findProduct(int productId) {
		System.out.println("Find product");
		Product p = em.find(Product.class, productId);
		return p;
	}

	@Override
	public List<Product> showMyProducts(int retailerId) {
		System.out.println("My products");
		TypedQuery myProducts = em.createQuery("Select p from Product p where p.retailer.retailerId = :retailerId",
				Product.class);
		myProducts.setParameter("retailerId", retailerId);
		List<Product> productList = myProducts.getResultList();
		return productList;
	}

	@Override
	@Transactional
	public boolean createUpdateRequest(int productId, Product p) {
		System.out.println("update req create");
		Product tempProduct = em.find(Product.class, productId);
		tempProduct.setProductPrice(p.getProductPrice());
		em.merge(tempProduct);
		return true;
	}

}
