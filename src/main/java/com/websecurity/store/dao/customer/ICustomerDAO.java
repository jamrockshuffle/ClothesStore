package com.websecurity.store.dao.customer;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Product;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> findAll();
    Customer findById(String id);
    List<Customer> deleteById (String id);
    Customer create (CustomerDTOCreate dtoObj);
    Customer update (CustomerDTOUpdate dtoObj);
}
