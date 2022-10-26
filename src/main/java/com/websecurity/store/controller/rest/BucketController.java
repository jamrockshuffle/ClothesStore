package com.websecurity.store.controller.rest;

import com.websecurity.store.dto.create.BucketDTOCreate;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.update.BucketDTOUpdate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.model.Bucket;
import com.websecurity.store.model.Order;
import com.websecurity.store.service.bucket.BucketServiceImpl;
import com.websecurity.store.service.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bucket")
public class BucketController {

    @Autowired
    BucketServiceImpl service;

    @RequestMapping("/find/all")
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public List<Bucket> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public Bucket getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Bucket> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN')")
    public Bucket create(@RequestBody BucketDTOCreate obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('ADMIN')")
    public Bucket update(@RequestBody BucketDTOUpdate obj) {

        return service.update(obj);
    }
}
