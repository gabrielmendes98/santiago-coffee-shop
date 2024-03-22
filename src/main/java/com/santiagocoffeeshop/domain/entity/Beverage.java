package com.santiagocoffeeshop.domain.entity;

import com.santiagocoffeeshop.domain.valueObject.Identifier;

public abstract class Beverage {
    private final Identifier id;
    private final String name;
    private final Float price;

    public Beverage(String name, Float price) {
        this.id = new Identifier();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Identifier getId() {
        return id;
    }
}
