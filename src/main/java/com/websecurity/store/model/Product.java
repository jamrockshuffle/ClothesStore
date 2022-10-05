package com.websecurity.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("Product")
public class Product {

    @Id
    private String id;

    private String description;
    private Color color;
    private Brand brand;
    private Size size;
    private BigDecimal pricePerUnit;
    //private int stock;

    public Product() {
    }

    public Product(String id, String description, Color color, Brand brand, Size size, BigDecimal pricePerUnit) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.pricePerUnit = pricePerUnit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + description + '\'' +
                ", color=" + color +
                ", brand=" + brand +
                ", size=" + size +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
