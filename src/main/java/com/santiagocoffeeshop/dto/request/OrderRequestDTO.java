package com.santiagocoffeeshop.dto.request;

import java.util.List;

public class OrderRequestDTO {
    private Integer tableNumber;
    private List<OrderItemRequestDTO> orderItems;

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<OrderItemRequestDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemRequestDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
