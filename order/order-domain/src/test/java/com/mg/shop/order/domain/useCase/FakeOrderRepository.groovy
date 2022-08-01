package com.mg.shop.order.domain.useCase


import java.util.stream.Collectors

class FakeOrderRepository implements com.mg.shop.order.domain.repository.OrderRepository{

    private Map<String, com.mg.shop.order.domain.model.Order> orders = new HashMap<>();
    @Override
    void save(com.mg.shop.order.domain.model.Order order) {
        orders.put(order.getId(), order);
    }

    @Override
    Optional<com.mg.shop.order.domain.model.Order> finfById(String id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    List<com.mg.shop.order.domain.model.Order> finfAll() {
        return orders.values().stream().collect(Collectors.toList());
    }
}
