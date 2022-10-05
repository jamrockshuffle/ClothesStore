package com.websecurity.store.controller.rest;

import com.websecurity.store.model.Color;
import com.websecurity.store.service.color.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/color")
public class ColorController {

    @Autowired
    ColorServiceImpl service;

    @RequestMapping("/find/all")
    public List<Color> findAll (){

        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public Color getById(@PathVariable String id) {

        return service.findById(id);
    }

    @GetMapping("/delete/{id}")
    public List<Color> deleteById(@PathVariable String id) {

        return service.deleteById(id);
    }

    @PostMapping("/create")
    public Color create(@RequestBody Color obj) {

        return service.create(obj);
    }

    @PostMapping("/update")
    public Color update(@RequestBody Color obj) {

        return service.update(obj);
    }
}
