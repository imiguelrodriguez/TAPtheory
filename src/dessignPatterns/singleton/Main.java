package dessignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        UserSingleton userSingleton = UserSingleton.getInstance();
        System.out.println(userSingleton.hashCode());
    }

}