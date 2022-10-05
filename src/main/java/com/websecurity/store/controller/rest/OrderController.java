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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/find/all")
    public List<Order> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public Order getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<Order> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public Order create(@RequestBody OrderDTOCreate obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public Order update(@RequestBody OrderDTOUpdate obj) {

        return service.update(obj);
    }
}
