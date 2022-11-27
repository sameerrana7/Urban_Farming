package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@Column(name = "ORDER_ID")
	private int orderId;

	@Column(name = "BILL")
	private float orderPrice;

	@Column(name = "ORDER_DATE")
	private String orderDate;

	public Order() {
		super();
	}

	public Order(int orderId, float orderPrice, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderPrice=" + orderPrice + ", orderDate=" + orderDate + "]";
	}

}
