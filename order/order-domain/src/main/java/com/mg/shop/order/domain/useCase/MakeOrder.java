package com.mg.shop.order.domain.useCase;

import com.mg.shop.order.domain.OrderIdGenerator;
import com.mg.shop.order.domain.model.Item;
import com.mg.shop.order.domain.model.Order;
import com.mg.shop.order.domain.model.Product;
import com.mg.shop.order.domain.repository.OrderRepository;
import com.mg.shop.order.domain.ProductFinder;

import java.util.List;
import java.util.Objects;

public class MakeOrder {

    final private OrderRepository orderRepository;
    final private ProductFinder productFinder;
    final private OrderIdGenerator orderIdGenerator;

    public MakeOrder(OrderRepository orderRepository, ProductFinder productFinder, OrderIdGenerator orderIdGenerator) {
        this.orderRepository = Objects.requireNonNull(orderRepository, "orderRepository must not be null");
        this.productFinder = Objects.requireNonNull(productFinder,"productFinder must not be null");
        this.orderIdGenerator = Objects.requireNonNull(orderIdGenerator, "orderIdGenerator must not be null");
    }

    public Order ordering( String productId, Integer quantity){
        Product product = this.productFinder.finfById(productId).orElseThrow();
        Order order = new Order(orderIdGenerator.generateId(), List.of(new Item(product,quantity)));
        this.orderRepository.save(order);
        return order;
    }
}
