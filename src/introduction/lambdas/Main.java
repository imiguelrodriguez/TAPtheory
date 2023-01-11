package introduction.lambdas;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Felix", 7);
        myCat.print();

        printThing(myCat);

        // Lambdas just allows us to pass in the implementations for simple methods such as print, as the printable parameter
        /*
        printThing(
                public void print() {
                    System.out.println("Meow");
        }
        );

        We don't need the modifier nor the name nor the return type
        So the syntax would be (parameters) -> {functionalities};

        Lambdas can only be used in the context of a functional interface (an interface with only one method)
        */
        printThing(() -> System.out.println("Meow"));

        // We can also store the lambda expression inside a variable
        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);
    }

    static void printThing (Printable thing) {
        thing.print();
    }
}
