package dessignPatterns.composite;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setUpOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );
        System.out.println("The total price is "+ deliveryService.calculateOrderPrice());
    }
}
