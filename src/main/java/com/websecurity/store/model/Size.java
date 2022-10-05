package com.websecurity.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Size")
public class Size {

    @Id
    private String id;

    private String name;

    public Size() {
    }

    public Size(String id, String name) {
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
        return "Size{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
