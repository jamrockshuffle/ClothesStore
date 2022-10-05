package com.websecurity.store.dto.create;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

public class OrderDTOCreate {

    private String product;
    private String quantity;
    private String invoiceNumber;

    public OrderDTOCreate() {
    }

    public OrderDTOCreate(String product, String quantity, String invoiceNumber) {
        this.product = product;
        this.quantity = quantity;
        this.invoiceNumber = invoiceNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
}
