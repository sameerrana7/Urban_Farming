package com.lti.gladiator.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTREQUESTS")
public class ProductRequest {

		@Id
		@SequenceGenerator(name = "seq_prod_req_gen", sequenceName = "seq_prod_req", allocationSize = 1)
		@GeneratedValue(generator = "seq_prod_req_gen")
		private int productRequestId;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "productId")
		Product product;
		
		double newProductPrice;
		
		int newProductQty;
		
		@ManyToOne
		@JoinColumn(name = "retailerId")
		Retailer retailer;
		
		@Column(length=15)
		private String requestStatus;
		
		@ManyToOne
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
		
		public ProductRequest( Product product, double newProductPrice, int newProductQty,
				Retailer retailer, String requestStatus, Admin admin) {
			super();
			
			this.product = product;
			this.newProductPrice = newProductPrice;
			this.newProductQty = newProductQty;
			this.retailer = retailer;
			this.requestStatus = requestStatus;
			this.admin = admin;
		}

		public ProductRequest(int productRequestId, Product product, double newProductPrice, int newProductQty,
				Retailer retailer, String requestStatus) {
			super();
			this.productRequestId = productRequestId;
			this.product = product;
			this.newProductPrice = newProductPrice;
			this.newProductQty = newProductQty;
			this.retailer = retailer;
			this.requestStatus = requestStatus;
		}
		
		public ProductRequest( Product product, double newProductPrice, int newProductQty,
				Retailer retailer, String requestStatus) {
			super();
			this.productRequestId = productRequestId;
			this.product = product;
			this.newProductPrice = newProductPrice;
			this.newProductQty = newProductQty;
			this.retailer = retailer;
			this.requestStatus = requestStatus;
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
