package com.ecommerce.persistance;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection=PersistanceConstant.COLLECTION_ORDER)
public class Orders {

	private String orderDate;
	private int orderID;
	private Products product;
	private String username;
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public String getCustomerAccount() {
		return username;
	}
	public void setCustomerAccount(String customerAccount) {
		this.username = customerAccount;
	}
	@Override
	public String toString() {
		return "Orders [orderDate=" + orderDate + ", orderID=" + orderID + ", product=" + product + ", customerAccount="
				+ username + "]";
	}
	
}
