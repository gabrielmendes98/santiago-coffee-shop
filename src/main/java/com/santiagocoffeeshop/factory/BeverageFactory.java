package com.santiagocoffeeshop.factory;

import com.santiagocoffeeshop.entity.beverage.Americano;
import com.santiagocoffeeshop.entity.beverage.Beverage;
import com.santiagocoffeeshop.entity.beverage.Espresso;
import com.santiagocoffeeshop.entity.beverageDecorator.Chocolate;
import com.santiagocoffeeshop.entity.beverageDecorator.Latte;
import com.santiagocoffeeshop.enums.BeverageTypeEnum;
import com.santiagocoffeeshop.enums.ToppingTypeEnum;

public class BeverageFactory {

    public static Beverage createBeverage(BeverageTypeEnum beverageType) {
        if (beverageType.equals(BeverageTypeEnum.ESPRESSO)) {
            return new Espresso();
        } else if (beverageType.equals(BeverageTypeEnum.AMERICANO)) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Invalid beverage type: " + beverageType);
        }
    }

    public static Beverage createTopping(ToppingTypeEnum toppingType, Beverage beverage) {
        if (toppingType.equals(ToppingTypeEnum.CHOCOLATE)) {
            return new Chocolate(beverage);
        } else if (toppingType.equals(ToppingTypeEnum.LATTE)) {
            return new Latte(beverage);
        } else {
            throw new IllegalArgumentException("Invalid topping type: " + toppingType);
        }
    }
}
