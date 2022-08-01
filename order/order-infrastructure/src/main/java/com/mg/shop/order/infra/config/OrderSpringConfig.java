package com.mg.shop.order.infra.config;

import com.mg.shop.order.domain.OrderIdGenerator;
import com.mg.shop.order.domain.model.Product;
import com.mg.shop.order.domain.repository.OrderRepository;
import com.mg.shop.order.domain.ProductFinder;
import com.mg.shop.order.domain.useCase.MakeOrder;
import com.mg.shop.order.domain.useCase.ViewOrders;
import com.mg.shop.order.infra.api.OrderApiConfig;
import com.mg.shop.order.infra.repositories.OrderRepositoryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Optional;
import java.util.UUID;

@Configuration
@Import({
        OrderRepositoryConfig.class,
        OrderApiConfig.class
})
public class OrderSpringConfig {

    @Bean
    OrderIdGenerator orderIdGenerator(){
        return new OrderIdGenerator() {
            @Override
            public String generateId() {
                return UUID.randomUUID().toString();
            }
        };
    }

    @Bean
    ProductFinder productFinder(){
        return new ProductFinder() {
            @Override
            public Optional<Product> finfById(String id) {
                return Optional.empty();
            }
        };
    }

    @Bean
    public ViewOrders viewOrders(OrderRepository orderRepository) {
        return new ViewOrders(orderRepository);
    }

    @Bean
    public MakeOrder makeOrder(OrderRepository orderRepository, ProductFinder productFinder, OrderIdGenerator orderIdGenerator){
        return new MakeOrder(orderRepository, productFinder, orderIdGenerator);
    }
}
