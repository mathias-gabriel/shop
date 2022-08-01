package com.mg.shop.order.domain.repository;

import com.mg.shop.order.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    public void save(Order order);

    public Optional<Order> finfById(String id);

    public List<Order> finfAll();
}
