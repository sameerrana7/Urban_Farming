package com.lti.gladiator.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	
	@Id
	private int productId;
	
	@Column(length=20)
	private String productName;
	
	private String productImage;
	
	@Column(length = 100)
	private String productDesc;
	

	private double productPrice;
	
	@Column(length=20)
	private String productBrand;
	

	private int productQty;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	Category category;

	@ManyToOne
	@JoinColumn(name="retailerId")
	Retailer retailer;
	
	
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public Product(int productId, String productName, String productImage, String productDesc, double productPrice,
			String productBrand, int productQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productQty = productQty;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productDesc=" + productDesc + ", productPrice=" + productPrice + ", productBrand=" + productBrand
				+ ", productQty=" + productQty + "]";
	}

	
	
	//Category category;
	
	//Retailer retailer;
	
	
	
	
	
}
