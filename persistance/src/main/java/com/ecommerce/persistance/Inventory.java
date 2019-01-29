package com.ecommerce.persistance;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection=PersistanceConstant.COLLECTION_INVENTORY)
public class Inventory {
	
	private Products product;
	private int quantityLeft;
	private String lastUpdatedTime;
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public int getQuantityLeft() {
		return quantityLeft;
	}
	public void setQuantityLeft(int quantityLeft) {
		this.quantityLeft = quantityLeft;
	}
	public String getLastUpdated() {
		return lastUpdatedTime;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdatedTime = lastUpdated;
	}
	@Override
	public String toString() {
		return "Inventory [product=" + product + ", quantityLeft=" + quantityLeft + ", lastUpdated=" + lastUpdatedTime
				+ "]";
	}
	

}
