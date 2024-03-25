package com.santiagocoffeeshop.repository;

import com.santiagocoffeeshop.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}