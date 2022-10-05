package com.websecurity.store.controller.rest;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.Color;
import com.websecurity.store.service.brand.BrandServiceImpl;
import com.websecurity.store.service.color.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brand")
public class BrandController {

    @Autowired
    BrandServiceImpl service;

    @RequestMapping("/find/all")
    public List<Brand> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public Brand getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<Brand> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public Brand create(@RequestBody Brand obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public Brand update(@RequestBody Brand obj) {

        return service.update(obj);
    }
}
