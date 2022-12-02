package com.lti.gladiator.beans;


public class ProductRequestDTO {
	
	private int productRequestId;
	
	private int productId;
	
	double newProductPrice;
	
	int newProductQty;

	private int retailerId;
	
	private String requestStatus;

	private int adminId;

	public ProductRequestDTO() {
		super();
	}

	public ProductRequestDTO(int productRequestId, int productId, double newProductPrice, int newProductQty,
			int retailerId, String requestStatus, int adminId) {
		super();
		this.productRequestId = productRequestId;
		this.productId = productId;
		this.newProductPrice = newProductPrice;
		this.newProductQty = newProductQty;
		this.retailerId = retailerId;
		this.requestStatus = requestStatus;
		this.adminId = adminId;
	}

	public int getProductRequestId() {
		return productRequestId;
	}

	public void setProductRequestId(int productRequestId) {
		this.productRequestId = productRequestId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getNewProductPrice() {
		return newProductPrice;
	}

	public void setNewProductPrice(double newProductPrice) {
		this.newProductPrice = newProductPrice;
	}

	public int getNewProductQty() {
		return newProductQty;
	}

	public void setNewProductQty(int newProductQty) {
		this.newProductQty = newProductQty;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "ProductRequestDTO [productRequestId=" + productRequestId + ", productId=" + productId
				+ ", newProductPrice=" + newProductPrice + ", newProductQty=" + newProductQty + ", retailerId="
				+ retailerId + ", requestStatus=" + requestStatus + ", adminId=" + adminId + "]";
	}
	
	

}
