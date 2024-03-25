package com.santiagocoffeeshop.dto.response;

public class OrderItemResponseDTO {
    private Double price;

    private String description;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
