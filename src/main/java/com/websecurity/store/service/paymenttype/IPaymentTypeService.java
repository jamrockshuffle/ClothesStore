package com.websecurity.store.service.paymenttype;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.PaymentType;

import java.util.List;

public interface IPaymentTypeService {
    List<PaymentType> findAll();
    PaymentType findById(String id);
    List<PaymentType> deleteById (String id);
    PaymentType create (PaymentType obj);
    PaymentType update (PaymentType obj);
}
