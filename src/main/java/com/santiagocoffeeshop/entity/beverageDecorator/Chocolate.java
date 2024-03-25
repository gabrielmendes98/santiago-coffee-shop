package com.santiagocoffeeshop.entity.beverageDecorator;

import com.santiagocoffeeshop.entity.beverage.Beverage;

public class Chocolate extends BeverageDecorator {
    private static final double ChocolateAddonPrice = 1.5;
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return this.beverage.getPrice() + ChocolateAddonPrice;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Chocolate";
    }
}