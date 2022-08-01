package com.mg.shop.product.domain.useCase;

import com.mg.shop.product.domain.model.Product;
import com.mg.shop.product.domain.repository.ProductRepository;
import java.util.List;

public class ViewProduct {

    private final ProductRepository productRepository;

    public ViewProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return this.productRepository.findAll();
    }
}
