package com.websecurity.store.repository;

import com.websecurity.store.model.Bucket;
import com.websecurity.store.model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends MongoRepository<Bucket, String> {
}
