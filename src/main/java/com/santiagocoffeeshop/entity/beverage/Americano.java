package com.santiagocoffeeshop.entity.beverage;

public class Americano extends Beverage {
    public Americano() {
        this.description = "Americano";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
