package com.websecurity.store.service.discountcard;

import com.websecurity.store.dao.brand.BrandDAOImpl;
import com.websecurity.store.dao.discountcard.DiscountCardDAOImpl;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.DiscountCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiscountCardServiceImpl implements IDiscountCardService {

    @Autowired
    DiscountCardDAOImpl dao;

    @Override
    public List<DiscountCard> findAll() {
        return dao.findAll();
    }

    @Override
    public DiscountCard findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<DiscountCard> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public DiscountCard create(DiscountCard obj) {
        return dao.create(obj);
    }

    @Override
    public DiscountCard update(DiscountCard obj) {
        return dao.update(obj);
    }
}
