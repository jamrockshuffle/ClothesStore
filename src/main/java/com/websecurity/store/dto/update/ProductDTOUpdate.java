package com.websecurity.store.dto.update;

public class ProductDTOUpdate {

    private String id;
    private String description;
    private String color;
    private String brand;
    private String size;
    private String pricePerUnit;

    public ProductDTOUpdate() {
    }

    public ProductDTOUpdate(String id, String description, String color, String brand, String size, String pricePerUnit) {
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
