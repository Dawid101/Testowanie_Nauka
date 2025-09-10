package pl.coderslab.week4.argument;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Test
    void shouldCalculateDiscount(){
        ProductService productService = new ProductService(productRepository);
        Product product = new Product("1","Laptop",1500,"elektronika");
        double discount = productService.calculateDiscount(product);
        assertEquals(1500 * 0.1, discount);
    }

    @Test
    void shouldReturnZero(){
        ProductService productService = new ProductService(productRepository);
        Product product = new Product("1","Laptop",2001,"elektronika");
        double discount = productService.calculateDiscount(product);

        assertEquals(0,discount);
    }

}