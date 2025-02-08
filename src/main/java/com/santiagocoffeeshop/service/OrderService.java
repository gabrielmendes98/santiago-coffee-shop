package com.santiagocoffeeshop.service;

import com.santiagocoffeeshop.dto.request.OrderItemRequestDTO;
import com.santiagocoffeeshop.dto.request.OrderRequestDTO;
import com.santiagocoffeeshop.dto.response.OrderItemResponseDTO;
import com.santiagocoffeeshop.dto.response.OrderResponseDTO;
import com.santiagocoffeeshop.entity.beverage.Beverage;
import com.santiagocoffeeshop.entity.order.Order;
import com.santiagocoffeeshop.entity.order.OrderItem;
import com.santiagocoffeeshop.factory.BeverageFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public OrderService() {
    }

    public OrderResponseDTO createOrder(OrderRequestDTO order) {
        if (order == null) {
            return null;
        }

        Order newOrder = new Order();
        newOrder.setTableNumber(order.getTableNumber());

        List<OrderItem> orderItems = order.getOrderItems().stream().map(orderItem -> {
            Beverage beverage = BeverageFactory.createBeverage(orderItem.getItem());

            beverage = BeverageFactory.addToppings(beverage, orderItem.getToppings());

            OrderItem newOrderItem = new OrderItem();
            newOrderItem.setPrice(beverage.getPrice());
            newOrderItem.setDescription(beverage.getDescription());
            return newOrderItem;
        }).toList();

        newOrder.setOrderItems(orderItems);

        OrderResponseDTO responseDTO = new OrderResponseDTO();
        responseDTO.setTableNumber(order.getTableNumber());
        responseDTO.setMessage("Thanks for your order!");
        responseDTO.setTotalPrice(orderItems.stream()
                .mapToDouble(OrderItem::getPrice)
                .sum());
        responseDTO.setOrderItems(orderItems.stream()
                .map(oi -> new OrderItemResponseDTO(oi.getPrice(), oi.getDescription()))
                .toList());

        return responseDTO;
    }
}
