package com.mg.shop.product.db.repositories;

import com.mg.shop.product.domain.model.Product;
import com.mg.shop.product.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {

    private final JpaProductRepository jpaProductRepository;

    public ProductRepositoryImpl(JpaProductRepository jpaOrderRepository) {
        this.jpaProductRepository = jpaOrderRepository;
    }

    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }
}
