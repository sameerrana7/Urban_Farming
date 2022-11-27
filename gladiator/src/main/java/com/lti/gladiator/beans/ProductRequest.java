package com.lti.gladiator.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductRequest {

		@Id
		private int productRequestId;
		
//		private Product product; // for productId and all other product filels
		
		private String requestStatus;
		
		private Admin admin;  // for adminId fk
}
