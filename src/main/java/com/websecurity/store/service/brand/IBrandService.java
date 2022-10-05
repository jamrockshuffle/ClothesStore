package com.websecurity.store.service.brand;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Color;

import java.util.List;

public interface IBrandService {
    List<Brand> findAll();
    Brand findById(String id);
    List<Brand> deleteById (String id);
    Brand create (Brand obj);
    Brand update (Brand obj);
}
