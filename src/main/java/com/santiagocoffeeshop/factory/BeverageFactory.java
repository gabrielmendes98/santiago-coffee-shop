package com.santiagocoffeeshop.factory;

import com.santiagocoffeeshop.entity.beverage.Americano;
import com.santiagocoffeeshop.entity.beverage.Beverage;
import com.santiagocoffeeshop.entity.beverage.Espresso;
import com.santiagocoffeeshop.entity.beverageDecorator.ToppingDecorator;
import com.santiagocoffeeshop.enums.BeverageTypeEnum;
import com.santiagocoffeeshop.enums.ToppingTypeEnum;

import java.util.List;

public class BeverageFactory {

    public static Beverage createBeverage(BeverageTypeEnum beverageType) {
        if (beverageType == BeverageTypeEnum.ESPRESSO) {
            return new Espresso();
        } else if (beverageType == BeverageTypeEnum.AMERICANO) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Invalid beverage type: " + beverageType);
        }
    }

    public static Beverage addToppings(Beverage beverage, List<ToppingTypeEnum> toppings) {
        if (toppings == null) {
            return beverage;
        }
        for (ToppingTypeEnum topping : toppings) {
            beverage = new ToppingDecorator(beverage, topping);
        }
        return beverage;
    }
}
