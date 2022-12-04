package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.ProductRequestDTO;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.exceptions.RetailerException;

@Repository
public class RetailerDaoImpl implements RetailerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Retailer findRetailer(int retailerId) throws RetailerException {

		Retailer r = em.find(Retailer.class, retailerId);
		return r;
	}
	
	public Retailer RetailerLogin(String email, String password) throws RetailerException {
		System.out.println("Retailer Login");
		TypedQuery loginretailer = em.createQuery(
				"Select r from Retailer r where r.retailerEmail = :retailerEmail and r.retailerPassword = :retailerPassword",
				Retailer.class);
		loginretailer.setParameter("retailerEmail", email);
		loginretailer.setParameter("retailerPassword", password);

		Retailer retailer;
		try {
			retailer = (Retailer) loginretailer.getSingleResult();
		} catch (Exception e) {
			throw new RetailerException("Invalid username or password");
		}
		return retailer;
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
	public int createUpdateRequest(ProductRequestDTO r) {
		System.out.println("update req create");
		ProductRequest newReq = new ProductRequest();

		newReq.setProductRequestId(r.getProductRequestId());

		Product product = em.find(Product.class, r.getProductId());
		newReq.setProduct(product);

		newReq.setNewProductPrice(r.getNewProductPrice());
		newReq.setNewProductQty(r.getNewProductQty());

		Retailer retailer = em.find(Retailer.class, r.getRetailerId());
		newReq.setRetailer(retailer);

		newReq.setRequestStatus(r.getRequestStatus());

		Admin admin = em.find(Admin.class, r.getAdminId());
		newReq.setAdmin(admin);

		newReq.setRequestStatus("in progress");
		em.persist(newReq);
		return newReq.getProductRequestId();
	}

}
