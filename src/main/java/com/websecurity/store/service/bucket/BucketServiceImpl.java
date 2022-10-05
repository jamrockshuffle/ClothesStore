package com.websecurity.store.service.bucket;

import com.websecurity.store.dao.bucket.BucketDAOImpl;
import com.websecurity.store.dao.customer.CustomerDAOImpl;
import com.websecurity.store.dto.create.BucketDTOCreate;
import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.update.BucketDTOUpdate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.model.Bucket;
import com.websecurity.store.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BucketServiceImpl implements IBucketService {

    @Autowired
    BucketDAOImpl dao;

    @Override
    public List<Bucket> findAll() {
        return dao.findAll();
    }

    @Override
    public Bucket findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Bucket> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Bucket create(BucketDTOCreate dtoObj) {
        return dao.create(dtoObj);
    }

    @Override
    public Bucket update(BucketDTOUpdate dtoObj) {
        return dao.update(dtoObj);
    }
}
