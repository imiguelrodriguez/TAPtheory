package dessignPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(new WhatsappDecorator(new Notifier("user18")));
        notifier.send("Like!");
    }
}
