package com.santiagocoffeeshop.controller;

import com.santiagocoffeeshop.entity.beverage.Beverage;
import com.santiagocoffeeshop.entity.beverage.Espresso;
import com.santiagocoffeeshop.entity.beverageDecorator.Chocolate;
import com.santiagocoffeeshop.entity.beverageDecorator.Latte;
import com.santiagocoffeeshop.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class Order {
    private final OrderService orderService;

    public Order(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("")
    public Beverage testBeverage() {
        Beverage beverage = new Espresso();
        beverage = new Latte(beverage);
        beverage = new Chocolate(beverage);

        return beverage;
    }

    @GetMapping("/today")
    public List<com.santiagocoffeeshop.model.Order> getTodayOrders() {
        return orderService.findAllCreatedToday();
    }

    @PostMapping("")
    public com.santiagocoffeeshop.model.Order createOrder() {
        throw new UnsupportedOperationException();
    }
}
