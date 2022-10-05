package com.websecurity.store.service.product;

import com.websecurity.store.dao.paymenttype.PaymentTypeDAOImpl;
import com.websecurity.store.dao.product.ProductDAOImpl;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.PaymentType;
import com.websecurity.store.model.Product;
import com.websecurity.store.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductDAOImpl dao;

    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }

    @Override
    public Product findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Product> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Product create(ProductDTOCreate dtoObj) {
        return dao.create(dtoObj);
    }

    @Override
    public Product update(ProductDTOUpdate dtoObj) {
        return dao.update(dtoObj);
    }
}
