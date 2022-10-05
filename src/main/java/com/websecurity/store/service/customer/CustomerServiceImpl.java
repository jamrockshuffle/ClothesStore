package com.websecurity.store.service.customer;

import com.websecurity.store.dao.customer.CustomerDAOImpl;
import com.websecurity.store.dao.order.OrderDAOImpl;
import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    CustomerDAOImpl dao;

    @Override
    public List<Customer> findAll() {
        return dao.findAll();
    }

    @Override
    public Customer findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Customer> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public Customer create(CustomerDTOCreate dtoObj) {
        return dao.create(dtoObj);
    }

    @Override
    public Customer update(CustomerDTOUpdate dtoObj) {
        return dao.update(dtoObj);
    }
}
