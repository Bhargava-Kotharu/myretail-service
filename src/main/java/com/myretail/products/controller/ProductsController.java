package com.myretail.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.products.dto.Product;
import com.myretail.products.exception.NotFoundException;
import com.myretail.products.service.ProductsService;

/**
 * This class handles the requests for Products API
 * 
 * @author bkotharu
 *
 */
@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductsController {

	@Autowired
	private ProductsService productService;

	/**
	 * This method returns the Product matching the given ID.
	 * 
	 * @param id
	 * @return Product
	 * @throws NotFoundException
	 */
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) throws NotFoundException {
		return productService.getProductById(id);
	}

	/**
	 * This method updates the Product price for the given Product
	 * 
	 * @param product
	 * @return ResponseEntity
	 * @throws NotFoundException
	 */
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) throws NotFoundException {
		productService.updateProduct(product);
		return ResponseEntity.noContent().build();
	}

}
