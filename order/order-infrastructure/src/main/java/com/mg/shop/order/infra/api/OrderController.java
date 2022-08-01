package com.mg.shop.order.infra.api;

import com.mg.shop.order.domain.model.Order;
import com.mg.shop.order.domain.useCase.MakeOrder;
import com.mg.shop.order.domain.useCase.ViewOrders;
import com.mg.shop.order.infra.dto.OrderDto;
import com.mg.shop.order.infra.mapper.OrderDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private ViewOrders viewOrders;
    private MakeOrder makeOrder;
    private OrderDtoMapper orderDtoMapper;

    public OrderController(ViewOrders viewOrders, MakeOrder makeOrder, OrderDtoMapper orderDtoMapper) {
        this.viewOrders = viewOrders;
        this.makeOrder = makeOrder;
        this.orderDtoMapper = orderDtoMapper;
    }

    @GetMapping()
    public List<OrderDto> getOrders() {
        return this.orderDtoMapper.toDto(this.viewOrders.getOrders());
    }

    @PutMapping()
    public OrderDto command(OrderDto orderDto){
        return mapToDto(this.makeOrder.ordering(orderDto.getId(), 2));
    }

    private OrderDto mapToDto(Order ordering) {
        return new OrderDto().setId(ordering.getId());
    }
}
