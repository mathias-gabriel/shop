package com.mg.shop.order.infra.dto;


import java.util.List;

public record OrderDto (String id, List<ItemDto> items) {

}
