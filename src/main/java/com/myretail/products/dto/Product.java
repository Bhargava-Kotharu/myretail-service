package com.myretail.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("current_price")
	private ProductPrice price;

	@JsonProperty("product_desc")
	private String productDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductPrice getPrice() {
		return price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", productDescription=" + productDescription + "]";
	}

}
