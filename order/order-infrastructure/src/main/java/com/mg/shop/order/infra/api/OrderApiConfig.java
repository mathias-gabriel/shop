package com.mg.shop.order.infra.api;

import com.mg.shop.order.domain.repository.OrderRepository;
import com.mg.shop.order.domain.useCase.ViewOrders;
import com.mg.shop.order.infra.mapper.OrderDtoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mg.shop.order.infra.api")
public class OrderApiConfig {

    @Bean
    public OrderDtoMapper orderDtoMapper() {
        return new OrderDtoMapper();
    }

}
