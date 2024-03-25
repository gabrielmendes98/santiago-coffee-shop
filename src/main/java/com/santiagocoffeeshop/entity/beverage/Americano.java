package com.santiagocoffeeshop.entity.beverage;

public class Americano implements Beverage {

    public Americano() {
    }

    @Override
    public double getPrice() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}
