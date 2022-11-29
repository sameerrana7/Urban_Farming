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
		@JoinColumn(name = "productId")
		Product product;
		
		double newProductPrice;
		
		int newProductQty;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "retailerId")
		Retailer retailer;
		
		@Column(length=15)
		private String requestStatus;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "adminId")
		Admin admin;

		public ProductRequest() {
			super();
		}

		public ProductRequest(int productRequestId, Product product, double newProductPrice, int newProductQty,
				Retailer retailer, String requestStatus, Admin admin) {
			super();
			this.productRequestId = productRequestId;
			this.product = product;
			this.newProductPrice = newProductPrice;
			this.newProductQty = newProductQty;
			this.retailer = retailer;
			this.requestStatus = requestStatus;
			this.admin = admin;
		}

		public int getProductRequestId() {
			return productRequestId;
		}

		public void setProductRequestId(int productRequestId) {
			this.productRequestId = productRequestId;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
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

		public Retailer getRetailer() {
			return retailer;
		}

		public void setRetailer(Retailer retailer) {
			this.retailer = retailer;
		}

		public String getRequestStatus() {
			return requestStatus;
		}

		public void setRequestStatus(String requestStatus) {
			this.requestStatus = requestStatus;
		}

		public Admin getAdmin() {
			return admin;
		}

		public void setAdmin(Admin admin) {
			this.admin = admin;
		}

		@Override
		public String toString() {
			return "ProductRequest [productRequestId=" + productRequestId + ", product=" + product
					+ ", newProductPrice=" + newProductPrice + ", newProductQty=" + newProductQty + ", retailer="
					+ retailer + ", requestStatus=" + requestStatus + ", admin=" + admin + "]";
		}
		

}
