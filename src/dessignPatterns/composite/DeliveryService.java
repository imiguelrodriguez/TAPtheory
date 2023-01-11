package dessignPatterns.composite;

import dessignPatterns.decorator.DatabaseService;

public class DeliveryService {
    private Box box;

    public DeliveryService(){

    }

    public void setUpOrder(Box ... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
