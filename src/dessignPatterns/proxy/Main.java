package dessignPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new RealInternet();
        internet.connectTo("www.google.com");
        internet.connectTo("www.banned.com");

        // Now using the proxy
        Internet internet2 = new ProxyInternet();
        internet2.connectTo("www.google.com");
        internet2.connectTo("www.banned.com");
    }
}
