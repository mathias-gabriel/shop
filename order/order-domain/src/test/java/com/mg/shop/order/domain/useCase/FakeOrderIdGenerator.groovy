package com.mg.shop.order.domain.useCase

import com.mg.shop.order.domain.OrderIdGenerator

class FakeOrderIdGenerator implements OrderIdGenerator{

    private String id

    FakeOrderIdGenerator(String id) {
        this.id = id
    }

    @Override
    String generateId() {
        return this.id;
    }
}
