package com.websecurity.store.service.brand;

import com.websecurity.store.dao.brand.BrandDAOImpl;
import com.websecurity.store.dao.color.ColorDAOImpl;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrandServiceImpl implements IBrandService {

    @Autowired
    BrandDAOImpl dao;

    @Override
    public List<Brand> findAll() {
        return dao.findAll();
    }

    @Override
    public Brand findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Brand> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Brand create(Brand obj) {
        return dao.create(obj);
    }

    @Override
    public Brand update(Brand obj) {
        return dao.update(obj);
    }
}
