package com.mg.shop.order.domain.useCase

class MakeOrderSpec extends spock.lang.Specification {

    def ID = "id"
    def orderIdGenerator = new FakeOrderIdGenerator(ID)
    def orderRepository = new FakeOrderRepository()
    def makeOrder = new MakeOrder(orderRepository, orderIdGenerator)

    void setup() {
    }

    def "should be able to make an order"() {

        given: "a product"
        def product = new com.mg.shop.order.domain.model.Product("id","name")

        and: "an item"
        def item = new com.mg.shop.order.domain.model.Item(product, 2)

        when: "make an order"

        def resultOrder = makeOrder.ordering(List.of(item))

        then: "the order has been placed"
        def orderExpected = new com.mg.shop.order.domain.model.Order(ID, List.of(item));
        orderExpected == resultOrder

        and: "the order is saved"
        def orderFound = orderRepository.finfById(ID);
        orderFound.isPresent() == true
        orderExpected == orderFound.get();
    }
}
