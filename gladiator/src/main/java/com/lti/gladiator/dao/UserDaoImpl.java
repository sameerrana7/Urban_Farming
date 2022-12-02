package com.lti.gladiator.dao;

import java.awt.print.Printable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Login;
import com.lti.gladiator.beans.Order;
import com.lti.gladiator.beans.User;
import com.lti.gladiator.exceptions.UserException;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;

	
	@Override
	@Transactional
	public boolean createUser(User e) {
		// TODO Auto-generated method stub
		System.out.println("User Dao");
		
		if(e==null) {
			return false;
		}else {
			em.persist(e);
			return true;
		}
	}

	@Override
	public User findUserById(int userid) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public User updateUser(User e) {
		// TODO Auto-generated method stub
		return e;
	}

	@Override
	public boolean deleteUser(User e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Order> getAllOrders(int userId) {
		TypedQuery qry = em.createQuery("SELECT o FROM Order o JOIN o.user u WHERE u.userId=:userId", Order.class);
		qry.setParameter("userId", userId);
		List<Order> orderList = qry.getResultList();
		if (orderList.isEmpty()) {
			System.out.println("XXXXXXXXXX No record Found XXXXXXXXXX sameer");
		}
		return orderList;
	}

	@Override
	@Transactional
	public User userLogin(String email,String password) throws UserException {
		//System.out.println("Inside UserDAO "+login);
		TypedQuery tqry = em.createQuery("SELECT u FROM User u WHERE u.userEmail=:userEmail and u.password=:password", User.class);
		tqry.setParameter("userEmail", email);
		tqry.setParameter("password",password);
		User user;
		try {
			user=(User) tqry.getSingleResult();
		}catch(Exception e) {
			throw new UserException("Inavalid email or password");
		}
		
		return user;
	}

}
