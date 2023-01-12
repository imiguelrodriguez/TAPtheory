package introduction.runnables;

public class Test {

    public static void main(String[] args) {

        // Runnable with inner anonymous class

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running inside an inner anonymous class!");
            }
        };

        // Runnable with lambda

        Runnable runnable2 = () -> System.out.println("I'm running inside a lambda function");

        runnable.run();
        runnable2.run();
    }

}
