package com.santiagocoffeeshop.controller;

import com.santiagocoffeeshop.dto.request.OrderRequestDTO;
import com.santiagocoffeeshop.dto.response.OrderResponseDTO;
import com.santiagocoffeeshop.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("")
    public OrderResponseDTO createOrder(@RequestBody OrderRequestDTO order) {
        return this.orderService.createOrder(order);
    }
}
