package com.myretail.products.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myretail.products.entity.ProductDetailsDocument;
import java.lang.Long;
import java.util.List;

@Repository
public interface ProductDetailsRepository extends MongoRepository<ProductDetailsDocument, String> {

	ProductDetailsDocument findByProductId(long productid);
}
