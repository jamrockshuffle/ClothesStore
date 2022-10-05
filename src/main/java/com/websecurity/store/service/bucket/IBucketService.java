package com.websecurity.store.service.bucket;

import com.websecurity.store.dto.create.BucketDTOCreate;
import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.update.BucketDTOUpdate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.model.Bucket;
import com.websecurity.store.model.Customer;

import java.util.List;

public interface IBucketService {
    List<Bucket> findAll();
    Bucket findById(String id);
    List<Bucket> deleteById (String id);
    Bucket create (BucketDTOCreate dtoObj);
    Bucket update (BucketDTOUpdate dtoObj);
}
