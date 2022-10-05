package com.websecurity.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("DiscountCard")
public class DiscountCard {

    @Id
    private String id;

    private BigDecimal discountPercentage;

    public DiscountCard() {
    }

    public DiscountCard(String id, BigDecimal discountPercentage) {
        this.id = id;
        this.discountPercentage = discountPercentage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "DiscountCard{" +
                "id='" + id + '\'' +
                ", discountPercentage='" + discountPercentage + '\'' +
                '}';
    }
}
