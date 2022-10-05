package com.websecurity.store.dao.customer;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Product;
import com.websecurity.store.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

    @Autowired
    CustomerRepository repository;

    @Autowired
    DiscountCardRepository discountRepository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Customer create(CustomerDTOCreate dtoObj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);

       Customer obj = new Customer();
       obj.setId(id);
       obj.setFullName(dtoObj.getFullName());
       obj.setEmail(dtoObj.getEmail());
       obj.setPhoneNumber(dtoObj.getPhoneNumber());
       obj.setAddress(dtoObj.getAddress());
       obj.setDiscountPercentage(discountRepository.findById(dtoObj.getDiscountPercentage()).get());

       repository.save(obj);

       return obj;
    }

    @Override
    public Customer update(CustomerDTOUpdate dtoObj) {

        Customer obj = new Customer();
        obj.setId(repository.findById(dtoObj.getId()).get().getId());
        obj.setFullName(dtoObj.getFullName());
        obj.setEmail(dtoObj.getEmail());
        obj.setPhoneNumber(dtoObj.getPhoneNumber());
        obj.setAddress(dtoObj.getAddress());
        obj.setDiscountPercentage(discountRepository.findById(dtoObj.getDiscountPercentage()).get());

        repository.save(obj);

        return obj;
    }
}
