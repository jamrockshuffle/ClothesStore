package com.websecurity.store.dao.discountcard;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.DiscountCard;

import java.util.List;

public interface IDiscountCardDAO {
    List<DiscountCard> findAll();
    DiscountCard findById(String id);
    List<DiscountCard> deleteById (String id);
    DiscountCard create (DiscountCard obj);
    DiscountCard update (DiscountCard obj);
}
