package pl.coderslab.week4.refactor;

import pl.coderslab.week3.mockito.Product;

import java.util.List;

public class Order {
    public double calculateTotalPrice(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
