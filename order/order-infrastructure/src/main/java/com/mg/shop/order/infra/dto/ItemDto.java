package com.mg.shop.order.infra.dto;

public class ItemDto {
    private String Id;
    private Integer quantity;

    public String getId() {
        return Id;
    }

    public ItemDto setId(String id) {
        Id = id;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public ItemDto setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
}
