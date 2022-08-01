package com.mg.shop.order.infra.repositories;

import com.mg.shop.order.infra.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOrderRepository extends JpaRepository<OrderEntity, String> {
}
