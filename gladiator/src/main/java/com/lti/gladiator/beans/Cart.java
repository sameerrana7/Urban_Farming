package com.lti.gladiator.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARTS")
public class Cart {
	
	@Id
	private int cartId;
	
	private int cartProdQty;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	User user;
	
	@ManyToOne(cascade = CascadeType.ALL)   // take a note to check this if diff users can add same product
	@JoinColumn(name="productId")
	Product product;

	public Cart() {
		super();
	}

	public Cart(int cartId, int cartProdQty, User user, Product product) {
		super();
		this.cartId = cartId;
		this.cartProdQty = cartProdQty;
		this.user = user;
		this.product = product;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCartProdQty() {
		return cartProdQty;
	}

	public void setCartProdQty(int cartProdQty) {
		this.cartProdQty = cartProdQty;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartProdQty=" + cartProdQty + ", user=" + user + ", product=" + product
				+ "]";
	}
	
	

}
