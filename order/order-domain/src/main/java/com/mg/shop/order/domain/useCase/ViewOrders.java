package com.mg.shop.order.domain.useCase;

import com.mg.shop.order.domain.repository.OrderRepository;
import com.mg.shop.order.domain.model.Order;

import java.util.List;
import java.util.Objects;

public class ViewOrders {

    private OrderRepository orderRepository;

    public ViewOrders(OrderRepository orderRepository) {
        this.orderRepository = Objects.requireNonNull(orderRepository, "orderRepository must not be null");
    }

    public List<Order> getOrders(){
        return orderRepository.finfAll();
    }
}
