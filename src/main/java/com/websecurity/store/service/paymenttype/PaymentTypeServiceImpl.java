package com.websecurity.store.service.paymenttype;

import com.websecurity.store.dao.brand.BrandDAOImpl;
import com.websecurity.store.dao.paymenttype.PaymentTypeDAOImpl;
import com.websecurity.store.model.Brand;
import com.websecurity.store.model.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentTypeServiceImpl implements IPaymentTypeService {

    @Autowired
    PaymentTypeDAOImpl dao;

    @Override
    public List<PaymentType> findAll() {
        return dao.findAll();
    }

    @Override
    public PaymentType findById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<PaymentType> deleteById(String id) {
        return dao.deleteById(id);
    }

    @Override
    public PaymentType create(PaymentType obj) {
        return dao.create(obj);
    }

    @Override
    public PaymentType update(PaymentType obj) {
        return dao.update(obj);
    }
}
