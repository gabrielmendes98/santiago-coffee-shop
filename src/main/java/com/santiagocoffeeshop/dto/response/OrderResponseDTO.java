package com.santiagocoffeeshop.dto.response;

import java.util.List;

public class OrderResponseDTO {
    List<OrderItemResponseDTO> orderItems;
    private String message;
    private Integer tableNumber;
    private Double totalPrice;

    public OrderResponseDTO(List<OrderItemResponseDTO> orderItems, String message, Integer tableNumber, Double totalPrice) {
        this.orderItems = orderItems;
        this.message = message;
        this.tableNumber = tableNumber;
        this.totalPrice = totalPrice;
    }

    public OrderResponseDTO() {
    }

    public List<OrderItemResponseDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemResponseDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
