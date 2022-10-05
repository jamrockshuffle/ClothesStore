package com.websecurity.store.dao.order;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Order;

import java.util.List;

public interface IOrderDAO {
    List<Order> findAll();
    Order findById(String id);
    List<Order> deleteById (String id);
    Order create (OrderDTOCreate dtoObj);
    Order update (OrderDTOUpdate dtoObj);
}
