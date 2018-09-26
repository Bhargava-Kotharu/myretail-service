package com.myretail.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@JsonProperty("value")
	private Long id;

	@JsonProperty("current_price")
	private ProductPrice productPrice;

	@JsonProperty("product_desc")
	private String productDescription;

}
