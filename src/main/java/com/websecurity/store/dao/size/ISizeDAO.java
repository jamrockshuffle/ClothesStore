package com.websecurity.store.dao.size;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Size;

import java.util.List;

public interface ISizeDAO {
    List<Size> findAll();
    Size findById(String id);
    List<Size> deleteById (String id);
    Size create (Size obj);
    Size update (Size obj);
}
