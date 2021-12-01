package com.guarderia.products_ms.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

public class Product {
    @Transient
    public static final String SEQUENCE_NAME2 = "Counter2";

    @Id
    private Integer id;
    private String name;
    private Integer price;
    private String description;
    private String city;

    public Product(Integer id, String name, Integer price, String description, String city) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
