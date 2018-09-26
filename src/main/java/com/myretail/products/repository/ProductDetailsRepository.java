package com.myretail.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myretail.products.entity.ProductDetailsDocument;

@Repository
public interface ProductDetailsRepository extends CrudRepository<ProductDetailsDocument, Long> {

}
