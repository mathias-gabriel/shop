package com.mg.shop.order.infra.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderEntity {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public OrderEntity id(String id) {
        this.id = id;
        return this;
    }
}
