public class Main {
    public static void main(String[] args) {

        ActionXML apple= new ActionXML("123","Apple inc.",180,"USD");
        apple.showXMLAction();

        AdapterXMLtoJSon appleJSON= new AdapterXMLtoJSon(apple);;
        appleJSON.showJSonAction();

        ActionJSon google = new ActionJSon("123","Google Inc.",210,"USD");
        google.showJSonAction();
    }
}