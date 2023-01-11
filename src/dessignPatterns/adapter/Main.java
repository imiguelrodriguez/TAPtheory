package dessignPatterns.adapter;

public class Main {
    public static void main(String[] args) {
       App app = new App();
       app.displayMenus(new XMLData());

       FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
       adapter.displayMenus(new XMLData());
    }
}
