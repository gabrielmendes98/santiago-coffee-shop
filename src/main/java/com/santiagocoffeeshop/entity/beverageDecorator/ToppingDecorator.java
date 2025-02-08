package com.santiagocoffeeshop.entity.beverageDecorator;

import com.santiagocoffeeshop.entity.beverage.Beverage;
import com.santiagocoffeeshop.enums.ToppingTypeEnum;

public class ToppingDecorator extends BeverageDecorator {
  private final ToppingTypeEnum toppingType;

  public ToppingDecorator(Beverage beverage, ToppingTypeEnum toppingType) {
    super(beverage);
    this.toppingType = toppingType;
  }

  @Override
  public double getPrice() {
    return beverage.getPrice() + toppingType.getPrice();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " + " + toppingType.name();
  }
}