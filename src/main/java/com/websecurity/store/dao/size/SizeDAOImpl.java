package com.websecurity.store.dao.size;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Size;
import com.websecurity.store.repository.BrandRepository;
import com.websecurity.store.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SizeDAOImpl implements ISizeDAO {

    @Autowired
    SizeRepository repository;

    @Override
    public List<Size> findAll() {
        return repository.findAll();
    }

    @Override
    public Size findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Size> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Size create(Size obj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);
        obj.setId(id);
        repository.save(obj);
        return obj;
    }

    @Override
    public Size update(Size obj) {
        obj.setId(obj.getId());
        repository.save(obj);
        return obj;
    }
}
