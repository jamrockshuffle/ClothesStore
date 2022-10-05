package com.websecurity.store.service.size;

import com.websecurity.store.dao.brand.BrandDAOImpl;
import com.websecurity.store.dao.size.SizeDAOImpl;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SizeServiceImpl implements ISizeService {

    @Autowired
    SizeDAOImpl dao;

    @Override
    public List<Size> findAll() {
        return dao.findAll();
    }

    @Override
    public Size findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Size> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Size create(Size obj) {
        return dao.create(obj);
    }

    @Override
    public Size update(Size obj) {
        return dao.update(obj);
    }
}
