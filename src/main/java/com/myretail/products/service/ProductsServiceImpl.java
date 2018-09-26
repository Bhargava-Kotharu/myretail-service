package com.myretail.products.service;

import org.springframework.stereotype.Service;

import com.myretail.products.dto.Product;
import com.myretail.products.exception.NotFoundException;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Override
	public Product getProductById(Long id) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product) throws NotFoundException {
		// TODO Auto-generated method stub

	}

}
