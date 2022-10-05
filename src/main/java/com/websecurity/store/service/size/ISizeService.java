package com.websecurity.store.service.size;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Size;

import java.util.List;

public interface ISizeService {
    List<Size> findAll();
    Size findById(String id);
    List<Size> deleteById (String id);
    Size create (Size obj);
    Size update (Size obj);
}
