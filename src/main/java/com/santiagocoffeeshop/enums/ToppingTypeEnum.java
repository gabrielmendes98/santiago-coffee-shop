package com.santiagocoffeeshop.enums;

public enum ToppingTypeEnum {
    LATTE(0.9),
    CHOCOLATE(1.5);

    private final double price;

    ToppingTypeEnum(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
