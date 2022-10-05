package com.websecurity.store.dao.discountcard;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.DiscountCard;
import com.websecurity.store.repository.BrandRepository;
import com.websecurity.store.repository.DiscountCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiscountCardDAOImpl implements IDiscountCardDAO {

    @Autowired
    DiscountCardRepository repository;

    @Override
    public List<DiscountCard> findAll() {
        return repository.findAll();
    }

    @Override
    public DiscountCard findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<DiscountCard> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public DiscountCard create(DiscountCard obj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);
        obj.setId(id);
        repository.save(obj);
        return obj;
    }

    @Override
    public DiscountCard update(DiscountCard obj) {
        obj.setId(obj.getId());
        repository.save(obj);
        return obj;
    }
}
