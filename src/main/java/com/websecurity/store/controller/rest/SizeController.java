package com.websecurity.store.controller.rest;

import com.websecurity.store.model.Color;
import com.websecurity.store.model.Size;
import com.websecurity.store.service.color.ColorServiceImpl;
import com.websecurity.store.service.size.SizeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/size")
public class SizeController {

    @Autowired
    SizeServiceImpl service;

    @RequestMapping("/find/all")
    public List<Size> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public Size getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<Size> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public Size create(@RequestBody Size obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public Size update(@RequestBody Size obj) {

        return service.update(obj);
    }
}
