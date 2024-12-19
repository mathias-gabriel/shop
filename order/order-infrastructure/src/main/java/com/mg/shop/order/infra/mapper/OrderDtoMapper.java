package com.mg.shop.order.infra.mapper;

import com.mg.shop.order.domain.model.Item;
import com.mg.shop.order.domain.model.Product;
import com.mg.shop.order.infra.dto.ItemDto;
import com.mg.shop.order.infra.dto.OrderDto;
import com.mg.shop.order.domain.model.Order;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDtoMapper {

    public OrderDtoMapper() {
    }

    public Order toDomain(OrderDto orderDto){
        return new Order(orderDto.id(), mapItemsTo(orderDto.items()));
    }

    private List<Item> mapItemsTo(List<ItemDto> items) {
        return items.stream().map(item->new Item(new Product(item.id(), ""), item.quantity() )).collect(Collectors.toList());
    }

    public List<OrderDto> toDto(List<Order> orders){
        return Collections.emptyList();
    }

    public OrderDto toDto(Order order){
        return new OrderDto(order.id(),null);
    }
}
