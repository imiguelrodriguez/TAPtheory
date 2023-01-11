package dessignPatterns.factory;

public abstract class RestaurantMethod {

    public Burger orderBurger() {
        Burger burger = createBurger();
        if(burger!=null) burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();
}
