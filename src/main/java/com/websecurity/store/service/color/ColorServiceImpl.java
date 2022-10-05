package com.websecurity.store.service.color;

import com.websecurity.store.dao.color.ColorDAOImpl;
import com.websecurity.store.model.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColorServiceImpl implements IColorService{

    @Autowired
    ColorDAOImpl dao;

    @Override
    public List<Color> findAll() {
        return dao.findAll();
    }

    @Override
    public Color findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Color> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Color create(Color obj) {
        return dao.create(obj);
    }

    @Override
    public Color update(Color obj) {
        return dao.update(obj);
    }
}
