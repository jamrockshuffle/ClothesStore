package com.websecurity.store.controller.rest;

import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Product;
import com.websecurity.store.service.brand.BrandServiceImpl;
import com.websecurity.store.service.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductServiceImpl service;

    @RequestMapping("/find/all")
    public List<Product> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public Product getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<Product> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public Product create(@RequestBody ProductDTOCreate obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public Product update(@RequestBody ProductDTOUpdate obj) {

        return service.update(obj);
    }
}
