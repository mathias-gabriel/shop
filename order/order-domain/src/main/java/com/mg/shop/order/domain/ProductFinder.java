package com.mg.shop.order.domain;

import com.mg.shop.order.domain.model.Product;

import java.util.Optional;

public interface ProductFinder {

    public Optional<Product> finfById(String id);
}
