package com.websecurity.store.dao.color;

import com.websecurity.store.model.Color;
import com.websecurity.store.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ColorDAOImpl implements IColorDAO{

    @Autowired
    ColorRepository repository;

    @Override
    public List<Color> findAll() {
        return repository.findAll();
    }

    @Override
    public Color findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Color> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Color create(Color obj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);
        obj.setId(id);
        repository.save(obj);
        return obj;
    }

    @Override
    public Color update(Color obj) {
        obj.setId(obj.getId());
        repository.save(obj);
        return obj;
    }
}
