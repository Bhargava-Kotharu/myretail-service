package com.myretail.products.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.myretail.products.dto.Product;
import com.myretail.products.exception.NotFoundException;

@SpringBootTest
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
public class ProductsControllerTest {

	@Autowired
	private ProductsController controller;

	@Test
	public void givenProductId_WhenGetProductById_ThenProductRetrieved() throws NotFoundException {

		// Given
		Long productId = new Long(1);

		// When
		Product product = controller.getProductById(productId);

		// Then
		assertNotNull(product);
		assertEquals(productId, product.getId());
	}

	@Test(expected = NotFoundException.class)
	public void givenInvalidProductId_WhenGetProductById_ThenThrowNotFoundException() throws NotFoundException {

		// Given
		Long productId = new Long(10);

		// When
		Product product = controller.getProductById(productId);

	}

	@Test
	public void givenProduct_WhenUpdateProduct_ThenUpdateProductPrice() throws NotFoundException {

		// Given
		Long productId = new Long(1);
		double updatedPrice = 4.50;
		Product product = controller.getProductById(productId);
		// Assert
		assertNotNull(product);
		assertEquals(productId, product.getId());
		product.getPrice().setValue(updatedPrice);

		// When
		ResponseEntity<?> response = controller.updateProduct(product);

		// Then
		assertNotNull(response);
		assertEquals(true, response.getStatusCode().is2xxSuccessful());

	}

	@Test(expected = NotFoundException.class)
	public void givenInvalidProduct_WhenUpdateProduct_ThenThrowNotFoundException() throws NotFoundException {

		// Given
		Long productId = new Long(10);
		double updatedPrice = 4.50;
		Product product = controller.getProductById(productId);
		// Assert
		assertNotNull(product);
		assertEquals(productId, product.getId());
		product.getPrice().setValue(updatedPrice);

		// When
		ResponseEntity<?> response = controller.updateProduct(product);

	}

}
