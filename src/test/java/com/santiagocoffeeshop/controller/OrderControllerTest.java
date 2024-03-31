package com.santiagocoffeeshop.controller;

import com.santiagocoffeeshop.dto.response.OrderItemResponseDTO;
import com.santiagocoffeeshop.dto.response.OrderResponseDTO;
import com.santiagocoffeeshop.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

    @Mock
    private OrderService orderService;

    @InjectMocks
    private OrderController orderController;

    @Test
    public void itShouldReturnOrderResponseDTOWhenCreateOrder() {
        OrderItemResponseDTO item1 = new OrderItemResponseDTO(20.00, "Item 1");
        OrderItemResponseDTO item2 = new OrderItemResponseDTO(25.00, "Item 2");
        OrderResponseDTO expectedResponse = new OrderResponseDTO(
                List.of(item1, item2),
                "Some message",
                1,
                45.00
        );

        Mockito.when(orderService.createOrder(Mockito.any())).thenReturn(expectedResponse);
        OrderResponseDTO response = orderController.createOrder(Mockito.any());
        assertEquals(45.00, response.getTotalPrice());
        assertEquals(1, response.getTableNumber());
        assertEquals("Some message", response.getMessage());
        assertEquals(List.of(item1, item2), response.getOrderItems());
    }

}
