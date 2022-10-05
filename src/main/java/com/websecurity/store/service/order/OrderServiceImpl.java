package com.websecurity.store.service.order;

import com.websecurity.store.dao.order.OrderDAOImpl;
import com.websecurity.store.dao.product.ProductDAOImpl;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Order;
import com.websecurity.store.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderDAOImpl dao;

    @Override
    public List<Order> findAll() {
        return dao.findAll();
    }

    @Override
    public Order findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Order> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Order create(OrderDTOCreate dtoObj) {
        return dao.create(dtoObj);
    }

    @Override
    public Order update(OrderDTOUpdate dtoObj) {
        return dao.update(dtoObj);
    }
}
