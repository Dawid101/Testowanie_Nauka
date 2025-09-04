package pl.coderslab.week3.mockito;

public class OrderService {
    public double calculateTotalPrice(Order order) {
        double totalPrice = 0;
        for (Product product : order.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
