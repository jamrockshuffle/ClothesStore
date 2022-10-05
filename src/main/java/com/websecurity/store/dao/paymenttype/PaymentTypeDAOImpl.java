package com.websecurity.store.dao.paymenttype;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.PaymentType;
import com.websecurity.store.repository.BrandRepository;
import com.websecurity.store.repository.PaymentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentTypeDAOImpl implements IPaymentTypeDAO {

    @Autowired
    PaymentTypeRepository repository;

    @Override
    public List<PaymentType> findAll() {
        return repository.findAll();
    }

    @Override
    public PaymentType findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<PaymentType> deleteById(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    @Override
    public PaymentType create(PaymentType obj) {
        String id = String.valueOf(this.findAll()
                .stream()
                .mapToInt(el -> Integer.parseInt(el.getId())).max().orElse(0) + 1);
        obj.setId(id);
        repository.save(obj);
        return obj;
    }

    @Override
    public PaymentType update(PaymentType obj) {
        obj.setId(obj.getId());
        repository.save(obj);
        return obj;
    }
}
