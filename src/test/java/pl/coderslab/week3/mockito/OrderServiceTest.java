package pl.coderslab.week3.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    @Test
    void testCalculateTotalPrice(){
        Order orderMock = mock(Order.class);
        when(orderMock.getProducts()).thenReturn(List.of(new Product("mleko",4.99),
                new Product("kawa", 15.99),
                new Product("ciasto", 21.99)
                ));

        OrderService orderService = new OrderService();
        double totalPrice = orderService.calculateTotalPrice(orderMock);
        assertEquals(42.97, totalPrice);
    }

}