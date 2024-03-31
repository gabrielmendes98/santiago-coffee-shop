package com.santiagocoffeeshop.entity.beverageDecorator;

import com.santiagocoffeeshop.entity.beverage.Beverage;

public class Chocolate extends BeverageDecorator {
    public static final double ChocolateAddonPrice = 1.5;

    public Chocolate(Beverage beverage) {
        super(beverage);
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