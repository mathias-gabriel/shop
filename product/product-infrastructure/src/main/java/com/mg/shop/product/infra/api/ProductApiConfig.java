package com.mg.shop.product.infra.api;

import com.mg.shop.product.infra.mapper.ProductDtoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mg.shop.product.infra.api")
public class ProductApiConfig {

    @Bean
    public ProductDtoMapper productDtoMapper() {
        return new ProductDtoMapper();
    }

}
