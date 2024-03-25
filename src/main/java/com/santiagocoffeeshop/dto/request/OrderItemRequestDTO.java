package com.santiagocoffeeshop.dto.request;

import com.santiagocoffeeshop.enums.BeverageTypeEnum;
import com.santiagocoffeeshop.enums.ToppingTypeEnum;

public class OrderItemRequestDTO {
    private BeverageTypeEnum item;
    private ToppingTypeEnum topping;

    public BeverageTypeEnum getItem() {
        return item;
    }

    public void setItem(BeverageTypeEnum item) {
        this.item = item;
    }

    public ToppingTypeEnum getTopping() {
        return topping;
    }

    public void setTopping(ToppingTypeEnum topping) {
        this.topping = topping;
    }
}
