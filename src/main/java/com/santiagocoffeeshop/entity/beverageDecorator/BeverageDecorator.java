package com.santiagocoffeeshop.entity.beverageDecorator;

import com.santiagocoffeeshop.entity.beverage.Beverage;

public class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }

    @Override
    public double getPrice() {
        return this.beverage.getPrice();
    }

}