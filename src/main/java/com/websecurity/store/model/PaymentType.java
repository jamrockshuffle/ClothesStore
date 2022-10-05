package com.websecurity.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("PaymentType")
public class PaymentType {

    @Id
    private String id;

    private String name;

    public PaymentType() {
    }

    public PaymentType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
