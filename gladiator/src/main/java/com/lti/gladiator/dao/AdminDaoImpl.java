package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.ProductRequest;
import com.lti.gladiator.beans.Retailer;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Admin adminLogin(Login login) {
		
		System.out.println("Inside AdminDao - \n " +login);
		
		TypedQuery tqry = em.createQuery("select a from Admin a where a.adminEmail =: adminEmail and a.adminPassword =: adminPassword", Admin.class);
		tqry.setParameter("adminEmail", login.getEmail());
		tqry.setParameter("adminPassword", login.getPassword());
		
		Admin admin = (Admin) tqry.getSingleResult();
		
		return admin;
	}

	@Override
	@Transactional
	public int addRetailer(Retailer retailer) {
		
		em.persist(retailer);
		
		return retailer.getRetailerId();
	}
	
	@Override
	@Transactional
	public int addProduct(Product p) {
		
		em.persist(p);
		
		return p.getProductId();
	}
	
	@Override
	public List<ProductRequest> getAllProductRequests() {

		TypedQuery tqry = em.createQuery("select pr from ProductRequest pr", ProductRequest.class);
		List<ProductRequest> prodReqList = (List<ProductRequest>) tqry.getResultList();
		
		return prodReqList;
	}
	
	@Override
	@Transactional
	public Product updateProduct(Product p) {
		
		Product updatedProduct = em.merge(p);
		
		return updatedProduct;
	}


	@Override
	public boolean approveRequest(ProductRequest prodReq) {
		
		//fetch the product
		Product p = em.find(Product.class, prodReq.getProduct().getProductId());
		
		//update product values
		p.setProductPrice(prodReq.getNewProductPrice());
		p.setProductQty(prodReq.getNewProductQty());
		
		//merge the product
		if(this.updateProduct(p)!=null)
		{
			//update the productRequest status
			ProductRequest prodReq2 = em.find(ProductRequest.class, prodReq.getProductRequestId());
			prodReq2.setRequestStatus("Approved");
			
			//merge the productRequest
			if(em.merge(prodReq2)!=null)
			{
				return true;
			}
		}
		
		
		return false;
	}

	
	


	
}
