package dessignPatterns.decorator;

public class Notifier implements INotifier{
    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService =  new DatabaseService();
    }
    @Override
    public void send(String message) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending "+ message + " by mail to "+ mail);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
