package com.myretail.products.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = 400129223115595469L;

}
