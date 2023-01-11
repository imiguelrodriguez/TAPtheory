package dessignPatterns.factory;

// Class whose sole responsability is creating burgers (a factory)
public class BurgerFactory {

    public Burger createBurger(String request) {
        Burger burger = null;
        if("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if("VEGGIE".equals(request)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}
