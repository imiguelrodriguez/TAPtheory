package dessignPatterns.decorator;

import dessignPatterns.proxy.Internet;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }
}
