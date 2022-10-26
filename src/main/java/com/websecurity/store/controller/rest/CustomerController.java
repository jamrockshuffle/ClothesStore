package com.websecurity.store.controller.rest;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Product;
import com.websecurity.store.service.customer.CustomerServiceImpl;
import com.websecurity.store.service.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl service;

    @RequestMapping("/find/all")
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public List<Customer> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public Customer getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Customer> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN')")
    public Customer create(@RequestBody CustomerDTOCreate obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('ADMIN')")
    public Customer update(@RequestBody CustomerDTOUpdate obj) {

        return service.update(obj);
    }
}
