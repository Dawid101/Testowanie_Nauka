package pl.coderslab.week4.refactor;

import org.junit.jupiter.api.Test;
import pl.coderslab.week3.mockito.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    @Test
    void shouldReturnTotalPrice(){
        Order order = new Order();
        List<Product> products = List.of(new Product("Laptop", 1500),
                new Product("Myszka", 100));
        double totalPrice = order.calculateTotalPrice(products);

        assertEquals(1600, totalPrice);

    }

}