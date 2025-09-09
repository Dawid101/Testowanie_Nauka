package pl.coderslab.week4.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    private ShoppingCart spyShoppingCart;

    @BeforeEach
    void setUp(){
        shoppingCart = new ShoppingCart();
        spyShoppingCart = spy(shoppingCart);
    }

    @Test
    void shouldUpdateProductQuantity() {
        spyShoppingCart.addProduct("1", 3);
        spyShoppingCart.updateProductQuantity("1", 2);
        assertEquals(2, spyShoppingCart.getProductQuantity("1"));
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            spyShoppingCart.updateProductQuantity("2", 2);
        });
    }
}