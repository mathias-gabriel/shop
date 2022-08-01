package com.mg.shop.product.db.repositories;

import com.mg.shop.product.db.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, String> {
}
