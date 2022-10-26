package com.websecurity.store.controller.rest;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Order;
import com.websecurity.store.service.customer.CustomerServiceImpl;
import com.websecurity.store.service.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/find/all")
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public List<Order> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public Order getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Order> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN')")
    public Order create(@RequestBody OrderDTOCreate obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('ADMIN')")
    public Order update(@RequestBody OrderDTOUpdate obj) {

        return service.update(obj);
    }
}
