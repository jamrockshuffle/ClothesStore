package com.websecurity.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("Order")
public class Order {

    @Id
    private String id;

    private Product product;
    private int quantity;
    private BigDecimal tax;
    private BigDecimal total;
    private String invoiceNumber;

    public Order() {
    }

    public Order(String id, Product product, int quantity, BigDecimal tax, BigDecimal total, String invoiceNumber) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.tax = tax;
        this.total = total;
        this.invoiceNumber = invoiceNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", quantity=" + quantity +
                ", tax=" + tax +
                ", total=" + total +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                '}';
    }
}
