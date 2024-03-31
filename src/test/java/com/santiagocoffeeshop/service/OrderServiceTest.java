package com.santiagocoffeeshop.service;

import com.santiagocoffeeshop.dto.request.OrderItemRequestDTO;
import com.santiagocoffeeshop.dto.request.OrderRequestDTO;
import com.santiagocoffeeshop.dto.response.OrderResponseDTO;
import com.santiagocoffeeshop.entity.beverage.Americano;
import com.santiagocoffeeshop.entity.beverageDecorator.Chocolate;
import com.santiagocoffeeshop.enums.BeverageTypeEnum;
import com.santiagocoffeeshop.enums.ToppingTypeEnum;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    private final OrderService orderService = new OrderService();

    @Test
    public void itShouldCreateOrderWithTopping() {
        OrderRequestDTO orderRequestDTO = new OrderRequestDTO();
        OrderItemRequestDTO orderItemRequestDTO = new OrderItemRequestDTO();

        double americanoPrice = new Americano().getPrice();
        double toppingPrice = Chocolate.ChocolateAddonPrice;
        double expectedTotalPrice = americanoPrice + toppingPrice;

        orderItemRequestDTO.setItem(BeverageTypeEnum.AMERICANO);
        orderItemRequestDTO.setTopping(ToppingTypeEnum.CHOCOLATE);

        orderRequestDTO.setTableNumber(1);
        orderRequestDTO.setOrderItems(Collections.singletonList(orderItemRequestDTO));

        OrderResponseDTO response = orderService.createOrder(orderRequestDTO);
        assertEquals(response.getTableNumber(), 1);
        assertEquals(response.getOrderItems().size(), 1);
        assertEquals(response.getOrderItems().get(0).getDescription(), "Americano + Chocolate");
        assertEquals(response.getTotalPrice(), expectedTotalPrice);
    }

}
