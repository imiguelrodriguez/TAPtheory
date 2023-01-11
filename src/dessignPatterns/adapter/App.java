package dessignPatterns.adapter;

public class App implements AppInterface {
    @Override
    public void displayMenus(XMLData xmlData) {
        System.out.println("Displaying old menus.");
    }

    @Override
    public void displayRecommendations(XMLData xmlData) {
        System.out.println("Displaying fancy recommendations.");
    }
}
