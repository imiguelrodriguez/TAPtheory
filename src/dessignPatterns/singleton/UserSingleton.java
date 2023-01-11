package dessignPatterns.singleton;

public class UserSingleton {
    // The class has a instance of the same class to return it every time getInstance() is called
    private static UserSingleton uSingleton;

    // Constructor is private
    private UserSingleton() {

    }

    // If main wants to have an object of the class, it will call getInstance()
    public synchronized static UserSingleton getInstance() {
        if(uSingleton == null) {
            uSingleton = new UserSingleton();
        }
        return uSingleton;
    }
}
