package com.websecurity.store.dao.bucket;

import com.websecurity.store.dto.create.BucketDTOCreate;
import com.websecurity.store.dto.create.ProductDTOCreate;
import com.websecurity.store.dto.update.BucketDTOUpdate;
import com.websecurity.store.dto.update.ProductDTOUpdate;
import com.websecurity.store.model.Bucket;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Order;
import com.websecurity.store.model.Product;
import com.websecurity.store.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class BucketDAOImpl implements IBucketDAO {

    @Autowired
    BucketRepository repository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PaymentTypeRepository paymentRepository;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Bucket> findAll() {
        return repository.findAll();
    }

    @Override
    public Bucket findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Bucket> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Bucket create(BucketDTOCreate dtoObj) {

        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);

        Customer customer = customerRepository.findById(dtoObj.getCustomer()).get();

        double grandTotal = orderRepository.findAll().stream()
                .filter(item -> item.getInvoiceNumber()
                        .equals(dtoObj.getInvoiceNumber()))
                .mapToDouble(item -> item.getTotal().doubleValue())
                .sum();

        double grandTotalDiscount = 0;

        if (!customer.getDiscountPercentage().getDiscountPercentage().equals(new BigDecimal(0))){
            grandTotalDiscount = grandTotal
                    * (100 - customer.getDiscountPercentage().getDiscountPercentage().doubleValue())
                    / 100;
        } else {
            grandTotalDiscount = grandTotal;
        }

       Bucket obj = new Bucket();
       obj.setId(id);
       obj.setCustomer(customerRepository.findById(dtoObj.getCustomer()).get());
       obj.setInvoiceNumber(dtoObj.getInvoiceNumber());
       obj.setGrandTotal(new BigDecimal(grandTotalDiscount));
       obj.setPayment(paymentRepository.findById(dtoObj.getPayment()).get());
       obj.setAddress(dtoObj.getAddress());
       obj.setOrderDate(LocalDate.parse(dtoObj.getOrderDate()));
       obj.setShipmentDate(LocalDate.parse(dtoObj.getShipmentDate()));
       obj.setDeliveryDate(LocalDate.parse(dtoObj.getDeliveryDate()));

       repository.save(obj);

       return obj;
    }

    @Override
    public Bucket update(BucketDTOUpdate dtoObj) {

        Customer customer = customerRepository.findById(dtoObj.getCustomer()).get();

        double grandTotal = orderRepository.findAll().stream()
                .filter(item -> item.getInvoiceNumber()
                        .equals(dtoObj.getInvoiceNumber()))
                .mapToDouble(item -> item.getTotal().doubleValue())
                .sum();

        double grandTotalDiscount = 0;

        if (!customer.getDiscountPercentage().getDiscountPercentage().equals(new BigDecimal(0))){
            grandTotalDiscount = grandTotal
                    * (100 - customer.getDiscountPercentage().getDiscountPercentage().doubleValue())
                    / 100;
        } else {
            grandTotalDiscount = grandTotal;
        }

        Bucket obj = new Bucket();
        obj.setId(repository.findById(dtoObj.getId()).get().getId());
        obj.setCustomer(customerRepository.findById(dtoObj.getCustomer()).get());
        obj.setInvoiceNumber(dtoObj.getInvoiceNumber());
        obj.setGrandTotal(new BigDecimal(grandTotalDiscount));
        obj.setPayment(paymentRepository.findById(dtoObj.getPayment()).get());
        obj.setAddress(dtoObj.getAddress());
        obj.setOrderDate(LocalDate.parse(dtoObj.getOrderDate()));
        obj.setShipmentDate(LocalDate.parse(dtoObj.getShipmentDate()));
        obj.setDeliveryDate(LocalDate.parse(dtoObj.getDeliveryDate()));

        repository.save(obj);

        return obj;
    }
}
