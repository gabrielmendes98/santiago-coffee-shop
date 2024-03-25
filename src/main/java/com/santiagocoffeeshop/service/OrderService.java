package com.santiagocoffeeshop.service;

import com.santiagocoffeeshop.model.Order;
import com.santiagocoffeeshop.repository.OrderItemRepository;
import com.santiagocoffeeshop.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final OrderItemRepository orderItemRepository;

    public OrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public List<Order> findAllCreatedToday() {
        return orderRepository.findAllByCreatedAt(LocalDateTime.now());
    }
}
