package com.myretail.products.dto;

public class ProductDetails {

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductDetails [description=" + description + "]";
	}

}
