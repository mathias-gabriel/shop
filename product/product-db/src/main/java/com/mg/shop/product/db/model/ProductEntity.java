package com.mg.shop.product.db.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="product")
public class ProductEntity {
    @Id
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="stock")
    private Integer stock;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public ProductEntity setStock(Integer stock) {
        this.stock = stock;
        return this;
    }
}
