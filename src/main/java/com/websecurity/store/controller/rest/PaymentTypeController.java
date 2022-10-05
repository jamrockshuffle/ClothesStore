package com.websecurity.store.controller.rest;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.PaymentType;
import com.websecurity.store.service.brand.BrandServiceImpl;
import com.websecurity.store.service.paymenttype.PaymentTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payment")
public class PaymentTypeController {

    @Autowired
    PaymentTypeServiceImpl service;

    @RequestMapping("/find/all")
    public List<PaymentType> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public PaymentType getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<PaymentType> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public PaymentType create(@RequestBody PaymentType obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public PaymentType update(@RequestBody PaymentType obj) {

        return service.update(obj);
    }
}
