package com.lti.gladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lti.gladiator.beans.Order;

public class OrderDaoImpl implements OrderDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Order generateOrder(int orderId) {
		return null;

	}

}
