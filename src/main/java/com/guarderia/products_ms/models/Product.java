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
    private Boolean isService;

    public Product(Integer id, String name, Integer price, Boolean isService ){
        this.id = id;
        this.name = name;
        this.price = price;
        this.isService = isService;
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

    public Boolean getIsService() {
        return isService;
    }

    public void setIsService(Boolean isService) {
        this.isService = isService;
    }
}
