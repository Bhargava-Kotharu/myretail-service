package com.myretail.products.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit4.SpringRunner;

import com.myretail.products.controller.ProductsController;
import com.myretail.products.dto.Product;
import com.myretail.products.entity.ProductEntity;
import com.myretail.products.entity.ProductPriceEntity;
import com.myretail.products.exception.NotFoundException;
import com.myretail.products.mapper.ProductMapper;
import com.myretail.products.repository.ProductDetailsRepository;
import com.myretail.products.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsServiceImplTest {

	@Autowired
	private ProductsServiceImpl productsServiceImpl;

	@Test
	public void givenProductId_WhenGetProductById_ThenProductRetrieved() throws NotFoundException {

		// Given
		Long productId = new Long(1);

		// When
		Product product = productsServiceImpl.getProductById(productId);

		// Then
		assertNotNull(product);
		assertEquals(productId, product.getId());
	}

	@Test(expected = NotFoundException.class)
	public void givenInvalidProductId_WhenGetProductById_ThenThrowNotFoundException() throws NotFoundException {

		// Given
		Long productId = new Long(10);

		// When
		productsServiceImpl.getProductById(productId);

	}

	@Test
	public void givenProduct_WhenUpdateProduct_ThenUpdateProductPrice() throws NotFoundException {

		// Given
		Long productId = new Long(1);
		double updatedPrice = 4.50;
		Product product = productsServiceImpl.getProductById(productId);
		// Assert
		assertNotNull(product);
		assertEquals(productId, product.getId());
		product.getPrice().setValue(updatedPrice);

		// When
		productsServiceImpl.updateProduct(product);

	}

	@Test(expected = NotFoundException.class)
	public void givenInvalidProduct_WhenUpdateProduct_ThenThrowNotFoundException() throws NotFoundException {

		// Given
		Long productId = new Long(10);
		double updatedPrice = 4.50;
		Product product = productsServiceImpl.getProductById(productId);
		// Assert
		assertNotNull(product);
		assertEquals(productId, product.getId());
		product.getPrice().setValue(updatedPrice);

		// When
		productsServiceImpl.updateProduct(product);

	}
}
