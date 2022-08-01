package com.mg.shop.product.domain.repository;

import com.mg.shop.product.domain.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
}
