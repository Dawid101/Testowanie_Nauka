package pl.coderslab.week4.spy;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String productId, int quantity) {
        products.put(productId, quantity);
    }

    public void removeProduct(String productId) {
        products.remove(productId);
    }

    public void updateProductQuantity(String productId, int newQuantity) {
        if (!products.containsKey(productId)) {
            throw new IllegalArgumentException("Product not in the cart");
        }
        products.put(productId, newQuantity);
    }

    // Metoda pomocnicza do testów
    public int getProductQuantity(String productId) {
        return products.getOrDefault(productId, 0);
    }
}
