package com.websecurity.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document("Bucket")
public class Bucket {

    @Id
    private String id;

    private Customer customer;
    private String invoiceNumber;
    private BigDecimal grandTotal;
    private PaymentType payment;
    private String address;
    private LocalDate orderDate;
    private LocalDate shipmentDate;
    private LocalDate deliveryDate;

    public Bucket() {
    }

    public Bucket(String id, Customer customer, String invoiceNumber, BigDecimal grandTotal, PaymentType payment, String address, LocalDate orderDate, LocalDate shipmentDate, LocalDate deliveryDate) {
        this.id = id;
        this.customer = customer;
        this.invoiceNumber = invoiceNumber;
        this.grandTotal = grandTotal;
        this.payment = payment;
        this.address = address;
        this.orderDate = orderDate;
        this.shipmentDate = shipmentDate;
        this.deliveryDate = deliveryDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public PaymentType getPayment() {
        return payment;
    }

    public void setPayment(PaymentType payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", grandTotal=" + grandTotal +
                ", payment=" + payment +
                ", address='" + address + '\'' +
                ", orderDate=" + orderDate +
                ", shipmentDate=" + shipmentDate +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
