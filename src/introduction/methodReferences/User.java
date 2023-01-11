package introduction.methodReferences;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Hello, I'm " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
