package com.lti.gladiator.beans;

import java.util.Arrays;

public class ProductListObject {
	
	private int[] prodIdList;

	public ProductListObject(int[] prodIdList) {
		super();
		this.prodIdList = prodIdList;
	}

	public ProductListObject() {
		super();
	}
	
	

	public int[] getProdIdList() {
		return prodIdList;
	}

	public void setProdIdList(int[] prodIdList) {
		this.prodIdList = prodIdList;
	}

	@Override
	public String toString() {
		return "ProductListObject [prodIdList=" + Arrays.toString(prodIdList) + "]";
	}
	
	
	
}
