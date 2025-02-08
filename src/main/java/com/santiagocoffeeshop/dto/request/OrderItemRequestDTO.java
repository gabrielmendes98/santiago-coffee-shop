package com.santiagocoffeeshop.dto.request;

import com.santiagocoffeeshop.enums.BeverageTypeEnum;
import com.santiagocoffeeshop.enums.ToppingTypeEnum;

import java.util.List;

public class OrderItemRequestDTO {
    private BeverageTypeEnum item;
    private List<ToppingTypeEnum> toppings;

    public BeverageTypeEnum getItem() {
        return item;
    }

    public void setItem(BeverageTypeEnum item) {
        this.item = item;
    }

    public List<ToppingTypeEnum> getToppings() {
        return toppings;
    }

    public void setToppings(List<ToppingTypeEnum> toppings) {
        this.toppings = toppings;
    }
}
