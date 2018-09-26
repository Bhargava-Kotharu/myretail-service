package com.myretail.products.service;

import com.myretail.products.dto.Product;
import com.myretail.products.exception.NotFoundException;

/**
 * Products Service
 * 
 * @author bkotharu
 *
 */
public interface ProductsService {

	/**
	 * This method returns the Product for the given ID
	 * 
	 * @param id
	 * @return Product
	 * @throws NotFoundException
	 */
	public Product getProductById(Long id) throws NotFoundException;

	/**
	 * This method updates the Product price for the given Product
	 * 
	 * @param Product
	 * @return
	 * @throws NotFoundException
	 */
	public void updateProduct(Product product) throws NotFoundException;

}
