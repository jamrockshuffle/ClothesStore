package com.websecurity.store.repository;

import com.websecurity.store.model.Color;
import com.websecurity.store.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
