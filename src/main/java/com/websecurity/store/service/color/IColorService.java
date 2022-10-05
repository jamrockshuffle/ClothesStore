package com.websecurity.store.service.color;

import com.websecurity.store.model.Color;

import java.util.List;

public interface IColorService {
    List<Color> findAll();
    Color findById(String id);
    List<Color> deleteById (String id);
    Color create (Color obj);
    Color update (Color obj);
}
