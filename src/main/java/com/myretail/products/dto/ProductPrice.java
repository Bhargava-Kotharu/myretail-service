package com.myretail.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductPrice {

	@JsonProperty("value")
	private Double value;

	@JsonProperty("currency_code")
	private String currencyCode;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Override
	public String toString() {
		return "ProductPrice [value=" + value + ", currencyCode=" + currencyCode + "]";
	}

}
