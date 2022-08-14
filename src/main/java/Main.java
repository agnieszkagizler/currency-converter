
public class Main {
    public static void main(String[] args) {

        ParserXml parserXml = new ParserXml();
        UserInterface userInterface = new UserInterface(parserXml.getRates());
        userInterface.menu();
    }
}
