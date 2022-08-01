package com.mg.shop.order.domain.useCase

import com.mg.shop.order.domain.model.Item
import com.mg.shop.order.domain.model.Order
import com.mg.shop.order.domain.model.Product

import static org.assertj.core.api.Assertions.assertThat
class ViewOrderSpec extends spock.lang.Specification {

    def orderRepository = new FakeOrderRepository()
    def viewOrder = new ViewOrders(orderRepository)

    void setup() {
    }

    def "should be able to view all orders"() {

        given: "a first order"
        def order1 = new Order("id1", List.of(new Item(new Product("id1", "name 1"), 2)))
        orderRepository.save(order1)

        and: "second order"
        def order2 = new Order("id2", List.of(new Item(new Product("id2", "name 2"), 3)))
        orderRepository.save(order2)

        when: "get orders"
        def resultOrders = viewOrder.getOrders()

        then: "all orders have been found"
        def ordersExpected = List.of(order1, order2);
        assertThat(ordersExpected)
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo( resultOrders)

    }
}
