package com.lti.gladiator;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.gladiator.beans.Admin;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.beans.Retailer;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.exceptions.AdminException;
import com.lti.gladiator.exceptions.RetailerException;
import com.lti.gladiator.exceptions.UserException;
import com.lti.gladiator.services.AdminServiceImpl;
import com.lti.gladiator.services.RetailerServiceImpl;
import com.lti.gladiator.services.UserServiceImpl;

@SpringBootTest
class GladiatorApplicationTests {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	AdminServiceImpl adminService;
	
	@Autowired
	RetailerServiceImpl retailerService;
	
	@Autowired
	UserServiceImpl userService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testAdminLogin() throws AdminException {
		
			Admin admin = adminService.adminLogin("shivam@gmail.com", "123456");
			System.out.println("before assert");
			Assertions.assertNotNull(admin);
		
	}
	
	@Test
	void testRetailerLogin() throws RetailerException  {
		
			Retailer retailer = retailerService.RetailerLogin("stella@gmail.com", "123456");
			System.out.println("before assert");
			Assertions.assertNotNull(retailer);
		
	}
	
	@Test
	void testUserLogin() throws UserException  {
		
			User user = userService.userLogin("aman@gmail.com", "123456");
			System.out.println("before assert");
			Assertions.assertNotNull(user);
		
	}
	
	
	
	@Test
	void testAdminPresent() {
		System.out.println("before qry creation");
		TypedQuery tqry = em.createQuery("select a from Admin a", Admin.class);
		
		System.out.println("after qry creation");

		List<Admin> result =  (List<Admin>) tqry.getResultList();
			System.out.println("Admintest result size : "+result.size());
		Assertions.assertTrue(result.size()>0);
		System.out.println("end of test");

		
	}
	
	@Test
	void testRetailerPresent() {
		TypedQuery tqry = em.createQuery("select r from Retailer r", Retailer.class);
		
		List<Retailer> result = (List<Retailer>) tqry.getResultList();
			
		Assertions.assertTrue(result.size()>0);
		
	}
	
	@Test
	void testProductPresent() {
		TypedQuery tqry = em.createQuery("select p from Product p", Product.class);
		
		List<Product> result = (List<Product>) tqry.getResultList();
			
		Assertions.assertTrue(result.size()>0);
		
	}
	
	@Test
	void testUserPresent() {
		TypedQuery tqry = em.createQuery("select u from User u", User.class);
		
		List<User> result = (List<User>) tqry.getResultList();
			
		Assertions.assertTrue(result.size()>0);
		
	}
	
}
