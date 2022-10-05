package com.websecurity.store.dao.brand;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Color;
import com.websecurity.store.repository.BrandRepository;
import com.websecurity.store.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrandDAOImpl implements IBrandDAO {

    @Autowired
    BrandRepository repository;

    @Override
    public List<Brand> findAll() {
        return repository.findAll();
    }

    @Override
    public Brand findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Brand> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Brand create(Brand obj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);
        obj.setId(id);
        repository.save(obj);
        return obj;
    }

    @Override
    public Brand update(Brand obj) {
        obj.setId(obj.getId());
        repository.save(obj);
        return obj;
    }
}
