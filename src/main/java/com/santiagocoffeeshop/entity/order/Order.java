package com.santiagocoffeeshop.entity.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer tableNumber;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}