package com.santiagocoffeeshop.entity.beverageDecorator;

import com.santiagocoffeeshop.entity.beverage.Beverage;

public class Latte extends BeverageDecorator {
    private static final double LatteAddonPrice = 0.9;

    public Latte(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return this.beverage.getPrice() + LatteAddonPrice;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + Latte";
    }
}