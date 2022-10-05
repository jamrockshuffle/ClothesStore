package com.websecurity.store.service.customer;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Order;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(String id);
    List<Customer> deleteById (String id);
    Customer create (CustomerDTOCreate dtoObj);
    Customer update (CustomerDTOUpdate dtoObj);
}
