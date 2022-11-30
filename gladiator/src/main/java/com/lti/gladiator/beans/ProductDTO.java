package com.lti.gladiator.beans;

public class ProductDTO {
	public int productId;
	public String productName;
	public String productImage;
	public String productDesc;
	public double productPrice;
	public String productBrand;
	public int productQty;
	public int categoryId;
	public int retailerId;
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public ProductDTO(int productId, String productName, String productImage, String productDesc, double productPrice,
			String productBrand, int productQty, int categoryId, int retailerId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productQty = productQty;
		this.categoryId = categoryId;
		this.retailerId = retailerId;
	}
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productDesc=" + productDesc + ", productPrice=" + productPrice + ", productBrand=" + productBrand
				+ ", productQty=" + productQty + ", categoryId=" + categoryId + ", retailerId=" + retailerId + "]";
	}
	
}
