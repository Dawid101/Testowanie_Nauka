package pl.coderslab.week4.argument;

import pl.coderslab.week3.mockito.Product;

import java.util.List;

public class ProductManager {
    private ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProducts(List<Product> products) {
        for (Product product : products) {
            productRepository.addProduct(product);
        }
    }
}
