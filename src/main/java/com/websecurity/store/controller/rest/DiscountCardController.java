package com.websecurity.store.controller.rest;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.DiscountCard;
import com.websecurity.store.service.brand.BrandServiceImpl;
import com.websecurity.store.service.discountcard.DiscountCardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/discount")
public class DiscountCardController {

    @Autowired
    DiscountCardServiceImpl service;

    @RequestMapping("/find/all")
    public List<DiscountCard> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public DiscountCard getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<DiscountCard> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public DiscountCard create(@RequestBody DiscountCard obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public DiscountCard update(@RequestBody DiscountCard obj) {

        return service.update(obj);
    }
}
