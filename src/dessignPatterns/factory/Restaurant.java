package dessignPatterns.factory;

public class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }
    public Burger orderBurger(String request) {
        // We create a factory
        BurgerFactory factory = new BurgerFactory();
        // The factory will create the type of burger of the request
        Burger burger = factory.createBurger(request);
        if(burger!=null) burger.prepare();
        return burger;
    }
}
