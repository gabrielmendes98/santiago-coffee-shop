package com.santiagocoffeeshop.repository;

import com.santiagocoffeeshop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByCreatedAt(LocalDateTime createdAt);
}