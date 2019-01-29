package com.ecommerce.persistance;

public class Products {

	private String productCode;
	private String productName;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Products [productCode=" + productCode + ", productName=" + productName + "]";
	}
	
}
