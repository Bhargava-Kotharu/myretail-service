package com.myretail.products.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_price")
public class ProductPriceEntity implements Serializable {

	private static final long serialVersionUID = -6689769984340844980L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "value")
	private Double value;

	@Column(name = "currency_code")
	private String currencyCode;

	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private ProductEntity productEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return "ProductPriceEntity [id=" + id + ", value=" + value + ", currencyCode=" + currencyCode + "]";
	}

}
