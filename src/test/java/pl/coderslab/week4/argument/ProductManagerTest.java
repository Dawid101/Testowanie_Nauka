package pl.coderslab.week4.argument;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import pl.coderslab.week3.mockito.Product;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProductManagerTest {

    @Test
    void testAddProducts() {
        ProductRepository mockProductRepository = mock(ProductRepository.class);
        ProductManager productManager = new ProductManager(mockProductRepository);

        List<Product> productsToAdd = Arrays.asList(
                new Product("Laptop", 1500),
                new Product("Smartphone", 800)
        );
        productManager.addProducts(productsToAdd);

        // Tworzenie ArgumentCaptor dla obiektu Product
        ArgumentCaptor<Product> productCaptor = ArgumentCaptor.forClass(Product.class);

        // Weryfikacja, czy metoda addProduct na mocku repozytorium produktów została wywołana odpowiednią liczbę razy
        verify(mockProductRepository, times(productsToAdd.size())).addProduct(productCaptor.capture());

        // Pobranie wszystkich przechwyconych argumentów
        List<Product> capturedProducts = productCaptor.getAllValues();

        // Sprawdzenie, czy ilość przechwyconych produktów jest zgodna z ilością przekazanych do metody
        assertEquals(productsToAdd.size(), capturedProducts.size());

        // Sprawdzenie poprawności właściwości każdego z przechwyconych produktów
        for (int i = 0; i < productsToAdd.size(); i++) {
            assertEquals(productsToAdd.get(i).getName(), capturedProducts.get(i).getName());
            assertEquals(productsToAdd.get(i).getPrice(), capturedProducts.get(i).getPrice());
        }
    }

}