package dessignPatterns.factory;

public class VeggieBurgerRestaurant extends RestaurantMethod{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
