package dessignPatterns.decorator;

public class WhatsappDecorator extends BaseNotifierDecorator{
    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String phoneNumber = databaseService.getPhoneFromUsername(getUsername());
        System.out.println("Sending " + message + " on Whatsapp to " + phoneNumber);
    }
}
