package dessignPatterns.factory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonalds");
        Burger burger = restaurant.orderBurger("VEGGIE");
        if(burger==null) System.out.print("Sorry, we haven't got that yet.");
        burger = restaurant.orderBurger("BEEF");
        if(burger==null) System.out.print("Sorry, we haven't got that yet.");
        burger = restaurant.orderBurger("BIGMAC");
        if(burger==null) System.out.print("Sorry, we haven't got that yet.");

    }
}
