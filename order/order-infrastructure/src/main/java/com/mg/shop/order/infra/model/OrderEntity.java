package com.mg.shop.order.infra.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record OrderEntity(@Id String id) {
}
