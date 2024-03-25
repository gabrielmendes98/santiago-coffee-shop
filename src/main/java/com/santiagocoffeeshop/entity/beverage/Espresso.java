package com.santiagocoffeeshop.entity.beverage;

public class Espresso implements Beverage {

    public Espresso() {

    }

    @Override
    public double getPrice() {
        return 6.00;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
