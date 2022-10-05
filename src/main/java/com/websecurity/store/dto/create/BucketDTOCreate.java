package com.websecurity.store.dto.create;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BucketDTOCreate {

    private String customer;
    private String invoiceNumber;
    private String payment;
    private String address;
    private String orderDate;
    private String shipmentDate;
    private String deliveryDate;

    public BucketDTOCreate() {
    }

    public BucketDTOCreate(String customer, String invoiceNumber, String payment, String address, String orderDate, String shipmentDate, String deliveryDate) {
        this.customer = customer;
        this.invoiceNumber = invoiceNumber;
        this.payment = payment;
        this.address = address;
        this.orderDate = orderDate;
        this.shipmentDate = shipmentDate;
        this.deliveryDate = deliveryDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
