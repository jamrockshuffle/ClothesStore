package com.websecurity.store.dao.product;

import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Color;
import com.websecurity.store.model.Product;
import com.websecurity.store.repository.BrandRepository;
import com.websecurity.store.repository.ColorRepository;
import com.websecurity.store.repository.ProductRepository;
import com.websecurity.store.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;

@Repository
public class ProductDAOImpl implements IProductDAO {

    @Autowired
    ProductRepository repository;

    @Autowired
    ColorRepository colorRepository;

    @Autowired
    BrandRepository brandRepository;

    @Autowired
    SizeRepository sizeRepository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Product> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Product create(ProductDTOCreate dtoObj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);

       Product obj = new Product();
       obj.setId(id);
       obj.setDescription(dtoObj.getDescription());
       obj.setColor(colorRepository.findById(dtoObj.getColor()).get());
       obj.setBrand(brandRepository.findById(dtoObj.getBrand()).get());
       obj.setSize(sizeRepository.findById(dtoObj.getSize()).get());
       obj.setPricePerUnit(new BigDecimal(dtoObj.getPricePerUnit()));

       repository.save(obj);

       return obj;
    }

    @Override
    public Product update(ProductDTOUpdate dtoObj) {

        Product obj = new Product();
        obj.setId(repository.findById(dtoObj.getId()).get().getId());
        obj.setDescription(dtoObj.getDescription());
        obj.setColor(colorRepository.findById(dtoObj.getColor()).get());
        obj.setBrand(brandRepository.findById(dtoObj.getBrand()).get());
        obj.setSize(sizeRepository.findById(dtoObj.getSize()).get());
        obj.setPricePerUnit(new BigDecimal(dtoObj.getPricePerUnit()));

        repository.save(obj);

        return obj;
    }
}
