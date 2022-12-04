package com.lti.gladiator.beans;

public class OrderDTO {
	public int orderId;
	public int productOrderQty;
	public double productOrderPrice;
	public int productId;
	public String productName;
	public int userId;
	public String  timeStamp;
	
	public OrderDTO() {
		super();
	}

	public OrderDTO(int orderId, int productOrderQty, double productOrderPrice, int productId, String productName,
			int userId, String timeStamp) {
		super();
		this.orderId = orderId;
		this.productOrderQty = productOrderQty;
		this.productOrderPrice = productOrderPrice;
		this.productId = productId;
		this.productName = productName;
		this.userId = userId;
		this.timeStamp = timeStamp;
	}

	public OrderDTO(int productOrderQty, double productOrderPrice, int productId, String productName, int userId,
			String timeStamp) {
		super();
		this.productOrderQty = productOrderQty;
		this.productOrderPrice = productOrderPrice;
		this.productId = productId;
		this.productName = productName;
		this.userId = userId;
		this.timeStamp = timeStamp;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductOrderQty() {
		return productOrderQty;
	}

	public void setProductOrderQty(int productOrderQty) {
		this.productOrderQty = productOrderQty;
	}

	public double getProductOrderPrice() {
		return productOrderPrice;
	}

	public void setProductOrderPrice(double productOrderPrice) {
		this.productOrderPrice = productOrderPrice;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", productOrderQty=" + productOrderQty + ", productOrderPrice="
				+ productOrderPrice + ", productId=" + productId + ", productName=" + productName + ", userId=" + userId
				+ ", timeStamp=" + timeStamp + "]";
	}

	
	
	

	

}
