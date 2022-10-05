package com.websecurity.store.dto.create;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

public class ProductDTOCreate {

    private String description;
    private String color;
    private String brand;
    private String size;
    private String pricePerUnit;

    public ProductDTOCreate() {
    }

    public ProductDTOCreate(String description, String color, String brand, String size, String pricePerUnit) {
        this.description = description;
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.pricePerUnit = pricePerUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(String pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
