package com.santiagocoffeeshop.entity.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double getPrice() {
        return 6.00;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
