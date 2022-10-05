package com.websecurity.store.service.product;

import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(String id);
    List<Product> deleteById (String id);
    Product create (ProductDTOCreate dtoObj);
    Product update (ProductDTOUpdate dtoObj);
}