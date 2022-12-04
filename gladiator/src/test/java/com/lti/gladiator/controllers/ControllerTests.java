package com.lti.gladiator.controllers;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.exceptions.AdminException;
import com.lti.gladiator.services.AdminServiceImpl;

class ControllerTests {

	
//	AdminServiceImpl adminService = new AdminServiceImpl();
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	
//	
//	@Test
//	void testAdminPresent() {
//		System.out.println("before qry creation");
//		TypedQuery tqry = em.createQuery("select a from Admin a", Admin.class);
//		
//		System.out.println("after qry creation");
//
//		List<Admin> result =  (List<Admin>) tqry.getResultList();
//			System.out.println("Admintest result size : "+result.size());
//		Assertions.assertTrue(result.size()>0);
//		System.out.println("end of test");
//
//		
//	}
//	
//	@Test
//	void testRetailerPresent() {
//		TypedQuery tqry = em.createQuery("select count(r) from Retailer r", Retailer.class);
//		
//		int result = (int) tqry.getSingleResult();
//			
//		Assertions.assertTrue(result>0);
//		
//	}
//	
//	@Test
//	void testProductPresent() {
//		TypedQuery tqry = em.createQuery("select count(p) from Product p", Product.class);
//		
//		int result = (int) tqry.getSingleResult();
//			
//		Assertions.assertTrue(result>0);
//		
//	}
//	
//	@Test
//	void testUserPresent() {
//		TypedQuery tqry = em.createQuery("select count(u) from User u", User.class);
//		
//		int result = (int) tqry.getSingleResult();
//			
//		Assertions.assertTrue(result>0);
//		
//	}
//	
//	@Test
//	void testAdminLogin() {
//		try {
//			System.out.println("before calling login");
//
//			Admin admin = adminService.adminLogin("admin1@gmail.com", "admin1");
//			System.out.println("before assert");
//			Assertions.assertNotNull(admin);
//		} catch (AdminException e) {
//			// TODO Auto-generated catch block
//			System.out.println("inside catch");
//			
//			e.printStackTrace();
//		}
//	}

}
