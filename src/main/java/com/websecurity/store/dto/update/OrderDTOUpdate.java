package com.websecurity.store.dto.update;

public class OrderDTOUpdate {

    private String id;
    private String product;
    private String quantity;
    private String invoiceNumber;

    public OrderDTOUpdate() {
    }

    public OrderDTOUpdate(String id, String product, String quantity, String invoiceNumber) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.invoiceNumber = invoiceNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
