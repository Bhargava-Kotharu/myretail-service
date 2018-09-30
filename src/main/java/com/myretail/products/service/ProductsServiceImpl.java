package com.myretail.products.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.products.dto.Product;
import com.myretail.products.entity.ProductDetailsDocument;
import com.myretail.products.entity.ProductEntity;
import com.myretail.products.exception.NotFoundException;
import com.myretail.products.mapper.ProductMapper;
import com.myretail.products.repository.ProductDetailsRepository;
import com.myretail.products.repository.ProductRepository;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductMapper productMapper;

	@Autowired
	private ProductDetailsRepository productDetailsRepository;

	@Override
	public Product getProductById(Long id) throws NotFoundException {

		ProductEntity productEntity = this.getProductEntity(id);

		ProductDetailsDocument productDetailsDocument = productDetailsRepository.findByProductId(id);

		Product product = productMapper.mapToDTO(productEntity);
		if (productDetailsDocument != null)
			product.setProductDescription(productDetailsDocument.getDescription());
		return product;
	}

	@Override
	@Transactional
	public void updateProduct(Product product) throws NotFoundException {

		ProductEntity productEntity = this.getProductEntity(product.getId());
		productEntity.getPrice().setValue(product.getPrice().getValue());

	}

	private ProductEntity getProductEntity(Long id) throws NotFoundException {
		return productRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Could not find product with id: " + id));
	}

}
