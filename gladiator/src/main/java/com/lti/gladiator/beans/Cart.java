package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CART")
public class Cart {
	
	@Id
	@Column(name = "CARTID")
	private int cartId;
	
	@Column(name = "CARTPRODQTY")
	private int cartProdQty;
	
	//@Column(name = "PRODID")
	//private Product prodId;
	
//	@Column(name = "USERID")
	//private User userId;
	
	
	
	

}
