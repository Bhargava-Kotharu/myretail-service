package com.myretail.products.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myretail.products.dto.Product;
import com.myretail.products.entity.ProductEntity;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;

/**
 * This class maps the ProductEntity to ProductDTO
 * 
 * @author bkotharu
 *
 */
@Component
public class ProductMapper {

	@Autowired
	private MapperFactory mapperFactory;

	public Product mapToDTO(ProductEntity productEntity) {
		mapperFactory.classMap(ProductEntity.class, Product.class).field("price", "price");
		MapperFacade mapper = mapperFactory.getMapperFacade();
		Product product = mapper.map(productEntity, Product.class);
		return product;
	}

	public ProductEntity mapToEntity(Product product) {
		mapperFactory.classMap(Product.class, ProductEntity.class);
		MapperFacade mapper = mapperFactory.getMapperFacade();
		ProductEntity productEntity = mapper.map(product, ProductEntity.class);
		return productEntity;
	}
}
