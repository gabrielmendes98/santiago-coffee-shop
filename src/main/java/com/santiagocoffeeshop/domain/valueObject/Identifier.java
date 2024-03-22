package com.santiagocoffeeshop.domain.valueObject;

import java.util.UUID;

public class Identifier {
    private UUID value;

    public Identifier() {
        this.value = UUID.randomUUID();
    }

    public UUID getValue() {
        return value;
    }

    public void setValue(UUID value) {
        this.value = value;
    }
}
