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
	private int ordId;

	@Column(name = "BILL")
	private float ordBill;

	@Column(name = "ORDER_DATE")
	private String ordDate;

	public Order() {
		super();
	}

	public Order(int ordId, float ordBill, String ordDate) {
		super();
		this.ordId = ordId;
		this.ordBill = ordBill;
		this.ordDate = ordDate;
	}

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public float getOrdBill() {
		return ordBill;
	}

	public void setOrdBill(float ordBill) {
		this.ordBill = ordBill;
	}

	public String getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}

	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordBill=" + ordBill + ", ordDate=" + ordDate + "]";
	}

}
