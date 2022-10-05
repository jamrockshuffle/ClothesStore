package com.websecurity.store.repository;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends MongoRepository<Brand, String> {
}
