package com.mg.shop.order.infra.dto;

import com.mg.shop.order.domain.model.Item;

import java.util.List;

public class OrderDto {

    private String Id;

    private List<ItemDto> items;

    public String getId() {
        return Id;
    }

    public OrderDto setId(String id) {
        Id = id;
        return this;
    }

    public List<ItemDto> getItems() {
        return items;
    }

}
