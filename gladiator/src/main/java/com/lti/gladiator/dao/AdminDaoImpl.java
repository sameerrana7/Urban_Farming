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
import com.lti.gladiator.exceptions.AdminException;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Admin adminLogin(String email, String password) throws AdminException{
		
		System.out.println("Inside AdminDao - \n ");
		
		TypedQuery tqry = em.createQuery("select a from Admin a where a.adminEmail =: adminEmail and a.adminPassword =: adminPassword", Admin.class);
		tqry.setParameter("adminEmail", email);
		tqry.setParameter("adminPassword", password);
		
		Admin admin;
		
		try {
			
			admin = (Admin) tqry.getSingleResult();
		}
		catch(Exception e)
		{
			throw new AdminException("Invalid username or password");
		}			
		
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
	@Transactional
	public boolean approveRequest(ProductRequest prodReq, int adminId) {
		
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
			prodReq2.setRequestStatus("approved");
			
			//set admin who approved it
			Admin admin = em.find(Admin.class, adminId);
			
			prodReq2.setAdmin(admin);
			
			//merge the productRequest
			if(em.merge(prodReq2)!=null)
			{
				return true;
			}
		}
		
		
		return false;
	}

	
	


	
}
