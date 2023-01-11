package dessignPatterns.decorator;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }

    public String getPhoneFromUsername(String username) {
        return username + "@Phone";
    }

    public String getFBFromUsername(String username) {
        return username + "@Facebook";
    }
}
