package com.guarderia.products_ms.models;

import org.springframework.data.annotation.Id;

public class Product {
    @Id
    private String id;
    private String name;
    private Integer price;
    private String description;
    private String city;

    public Product(String id, String name, Integer price, String description, String city) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.city = city;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
