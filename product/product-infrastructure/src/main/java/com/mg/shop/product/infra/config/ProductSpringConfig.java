package com.mg.shop.product.infra.config;

import com.mg.shop.product.db.ProductRepositoryConfig;
import com.mg.shop.product.domain.repository.ProductRepository;
import com.mg.shop.product.domain.useCase.ViewProduct;
import com.mg.shop.product.infra.api.ProductApiConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ProductRepositoryConfig.class,
        ProductApiConfig.class
})
public class ProductSpringConfig {

    @Bean
    public ViewProduct viewProduct(ProductRepository productRepository) {
        return new ViewProduct(productRepository);
    }

}
