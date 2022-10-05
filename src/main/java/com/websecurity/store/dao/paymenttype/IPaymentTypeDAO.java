package com.websecurity.store.dao.paymenttype;

import com.websecurity.store.model.Brand;
import com.websecurity.store.model.PaymentType;

import java.util.List;

public interface IPaymentTypeDAO {
    List<PaymentType> findAll();
    PaymentType findById(String id);
    List<PaymentType> deleteById (String id);
    PaymentType create (PaymentType obj);
    PaymentType update (PaymentType obj);
}
