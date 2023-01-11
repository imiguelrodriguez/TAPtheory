package dessignPatterns.adapter;

public class FancyUIServiceAdapter implements AppInterface{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XMLData xmlData) {
        JSONData jsonData = convertXMLtoJSON(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XMLData xmlData) {
        JSONData jsonData = convertXMLtoJSON(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JSONData convertXMLtoJSON(XMLData xmlData) {

        return null;
    }
}
