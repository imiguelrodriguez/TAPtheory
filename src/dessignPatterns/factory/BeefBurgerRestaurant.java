package dessignPatterns.factory;

public class BeefBurgerRestaurant extends RestaurantMethod{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
