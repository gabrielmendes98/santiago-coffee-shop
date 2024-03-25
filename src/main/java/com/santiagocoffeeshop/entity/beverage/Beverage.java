package com.santiagocoffeeshop.entity.beverage;

public abstract class Beverage {
    public String description;

    abstract public String getDescription();

    abstract public double getPrice();
}
