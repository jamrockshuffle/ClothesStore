package com.websecurity.store.service.order;

import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Order;
import com.websecurity.store.model.Product;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();
    Order findById(String id);
    List<Order> deleteById (String id);
    Order create (OrderDTOCreate dtoObj);
    Order update (OrderDTOUpdate dtoObj);
}
