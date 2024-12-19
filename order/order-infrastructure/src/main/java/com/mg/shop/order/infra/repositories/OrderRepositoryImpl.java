package com.mg.shop.order.infra.repositories;

import com.mg.shop.order.domain.model.Order;
import com.mg.shop.order.domain.repository.OrderRepository;
import com.mg.shop.order.infra.mapper.OrderDtoMapper;
import com.mg.shop.order.infra.model.OrderEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("orderRepository")
public class OrderRepositoryImpl implements OrderRepository {

    private final JpaOrderRepository jpaOrderRepository;

    public OrderRepositoryImpl(JpaOrderRepository jpaOrderRepository) {
        this.jpaOrderRepository = jpaOrderRepository;
    }

    @Override
    public void save(Order order) {
        this.jpaOrderRepository.save(mapToModel(order));
    }

    private OrderEntity mapToModel(Order order) {
        return new OrderEntity(order.id());
    }

    @Override
    public Optional<Order> finfById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Order> finfAll() {
        return null;
    }
}
