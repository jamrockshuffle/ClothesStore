package com.websecurity.store.dao.bucket;

import com.websecurity.store.dto.create.BucketDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.BucketDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Bucket;
import com.websecurity.store.model.Product;

import java.util.List;

public interface IBucketDAO {
    List<Bucket> findAll();
    Bucket findById(String id);
    List<Bucket> deleteById (String id);
    Bucket create (BucketDTOCreate dtoObj);
    Bucket update (BucketDTOUpdate dtoObj);
}
