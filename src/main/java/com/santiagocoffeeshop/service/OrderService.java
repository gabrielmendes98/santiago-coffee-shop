package com.santiagocoffeeshop.service;

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
        Order newOrder = new Order();
        newOrder.setTableNumber(order.getTableNumber());

        List<OrderItem> orderItems = order.getOrderItems().stream().map(orderItem -> {
            OrderItem newOrderItem = new OrderItem();
            Beverage beverage = BeverageFactory.createBeverage(orderItem.getItem());
            if (orderItem.getTopping() != null) {
                beverage = BeverageFactory.createTopping(orderItem.getTopping(), beverage);
            }
            newOrderItem.setPrice(beverage.getPrice());
            newOrderItem.setDescription(beverage.getDescription());

            return newOrderItem;
        }).toList();

        newOrder.setOrderItems(orderItems);

        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setTableNumber(order.getTableNumber());
        orderResponseDTO.setMessage("Thanks for your order!");
        orderResponseDTO.setTotalPrice(orderItems.stream().mapToDouble(OrderItem::getPrice).sum());
        orderResponseDTO.setOrderItems(orderItems.stream().map(orderItem -> {
            OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();
            orderItemResponseDTO.setDescription(orderItem.getDescription());
            orderItemResponseDTO.setPrice(orderItem.getPrice());
            return orderItemResponseDTO;
        }).toList());

        return orderResponseDTO;
    }
}
