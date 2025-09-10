package pl.coderslab.week4.argument;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public double calculateDiscount(Product product) {
        // Sprawdzamy, czy cena produktu spełnia warunki rabatu
        if (product.getPrice() > 1000 && product.getPrice() < 2000 && product.getCategory().equals("elektronika")) {
            // Naliczamy rabat 10%
            return product.getPrice() * 0.1;
        }
        return 0; // Brak rabatu dla pozostałych produktów
    }
}
