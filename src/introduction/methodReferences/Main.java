package introduction.methodReferences;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Manolo"), new User("Catalina"));

        // Declarative approach using lambda
        users.forEach(user -> System.out.println(user.getName()));

        // Static method reference (Class::method)
        users.forEach(Main::showUser);

        // Object method reference
        Animal animal = new Animal(4);
        users.forEach(animal::userAnimal);

        // Arbitrary object reference
        users.forEach(User::printHello);

        // Constructor reference
        CreateUserInterface inter = User::new;
        User user1 = inter.createUser("Pepa");
        User user2 = inter.createUser("Juana");

        System.out.println(user1.getName());
        System.out.println(user2.getName());

        users.forEach(System.out::println);
    }

    public static void showUser(User user) {
        System.out.println(user.getName());
    }

    public static class Animal {
        private int legs;

        public Animal(int legs) {
            this.legs = legs;
        }

        public int getLegs() {
            return legs;
        }

        public void setLegs(int legs) {
            this.legs = legs;
        }

        public void userAnimal(User user) {
            System.out.println("I'm " + user.getName() + " and I have " + legs + " legs");
        }
    }

}
