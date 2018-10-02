package com.myretail.products.entity;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product_details")
public class ProductDetailsDocument implements Serializable {

	private static final long serialVersionUID = 8453151801587059366L;

	@Id
	@Field(value = "id")
	private String id;

	@Field(value = "product_id")
	private long productId;

	@Field(value = "description")
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
