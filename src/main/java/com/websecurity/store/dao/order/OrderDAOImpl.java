package com.websecurity.store.dao.order;

import com.websecurity.store.dto.create.CustomerDTOCreate;
import com.websecurity.store.dto.create.OrderDTOCreate;
import com.websecurity.store.dto.update.CustomerDTOUpdate;
import com.websecurity.store.dto.update.OrderDTOUpdate;
import com.websecurity.store.model.Customer;
import com.websecurity.store.model.Order;
import com.websecurity.store.model.Product;
import com.websecurity.store.repository.CustomerRepository;
import com.websecurity.store.repository.DiscountCardRepository;
import com.websecurity.store.repository.OrderRepository;
import com.websecurity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class OrderDAOImpl implements IOrderDAO {

    @Autowired
    OrderRepository repository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public Order findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Order> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public Order create(OrderDTOCreate dtoObj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);

        BigDecimal price = productRepository.findById(dtoObj.getProduct()).get().getPricePerUnit();
        BigDecimal total = new BigDecimal(dtoObj.getQuantity()).multiply(price);
        BigDecimal totalTax = total.add(total.multiply(new BigDecimal("0.167")));

        Order obj = new Order();
        obj.setId(id);
        obj.setProduct(productRepository.findById(dtoObj.getProduct()).get());
        obj.setQuantity(Integer.parseInt(dtoObj.getQuantity()));
        obj.setTax(new BigDecimal("16.7"));
        obj.setTotal(totalTax);
        obj.setInvoiceNumber(dtoObj.getInvoiceNumber());

       repository.save(obj);

       return obj;
    }

    @Override
    public Order update(OrderDTOUpdate dtoObj) {

        BigDecimal price = productRepository.findById(dtoObj.getProduct()).get().getPricePerUnit();
        BigDecimal total = new BigDecimal(dtoObj.getQuantity()).multiply(price);
        BigDecimal totalTax = total.add(total.multiply(new BigDecimal("0.167")));

        Order obj = new Order();
        obj.setId(repository.findById(dtoObj.getId()).get().getId());
        obj.setProduct(productRepository.findById(dtoObj.getProduct()).get());
        obj.setQuantity(Integer.parseInt(dtoObj.getQuantity()));
        obj.setTax(new BigDecimal("16.7"));
        obj.setTotal(totalTax);
        obj.setInvoiceNumber(dtoObj.getInvoiceNumber());

        repository.save(obj);

        return obj;
    }
}
