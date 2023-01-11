package introduction.anonymousClasses;

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        // If we wanted to create a completely different animal but only once in a lifetime, we can
        // use anonymous inner classes

        Animal bigFoot = new Animal() { // here we are creating an anonymous subclass of the Animal class
            @Override
            public void makeNoise() {
                System.out.println("GRrraaaaaww");
            }
        };
        bigFoot.makeNoise();

        // Another way to create an anonymous inner class is by implementing an interface
        Runnable myAnonymousRunnable = new Runnable() { // note that instantiation of interfaces is not possible, but here we are creating a class that implements the interface
            @Override
            public void run() {
                System.out.println("I'm an anonymous runnable!");
            }
        };

        myAnonymousRunnable.run();
    }
}
