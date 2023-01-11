package dessignPatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static List<String> bannedSites;
    private final Internet internet = new RealInternet();

    public ProxyInternet() {
        bannedSites = new ArrayList<String>();
        bannedSites.add("www.banned.com");
        bannedSites.add("www.restricted.com");
    }
    @Override
    public void connectTo(String host) {
        if(bannedSites.contains(host))
            System.out.println("Access denied!");
        else internet.connectTo(host);
    }
}
