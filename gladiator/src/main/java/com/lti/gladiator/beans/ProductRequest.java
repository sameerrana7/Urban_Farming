package com.lti.gladiator.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTREQUESTS")
public class ProductRequest {

		@Id
		private int productRequestId;
		
		@ManyToOne(cascade = CascadeType.ALL)
		Product product;
		
		double newProductPrice;
		
		int newProductQty;
		
		@ManyToOne(cascade = CascadeType.ALL)
		Retailer retailer;
		
		@Column(length=15)
		private String requestStatus;
		
		@ManyToOne(cascade = CascadeType.ALL)
		Admin admin;
		
}
