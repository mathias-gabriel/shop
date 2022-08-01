package com.mg.shop.order.infra.repositories;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.mg.shop.order.infra.model")
@EnableJpaRepositories(basePackages = "com.mg.shop.order.infra.repositories")
@ComponentScan("com.mg.shop.order.infra.repositories")
public class OrderRepositoryConfig {
}
