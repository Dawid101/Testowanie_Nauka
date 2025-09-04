package pl.coderslab.week3.mockito;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
