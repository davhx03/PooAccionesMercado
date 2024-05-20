public class ActionJSon {
    private String idActionJson;
    private String name;
    private double preis;
    private String currency;

    public ActionJSon(String idAction, String name, double preis, String currency) {
        this.idActionJson = idAction;
        this.name = name;
        this.preis = preis;
        this.currency = currency;
    }


    public void showJSonAction() {
        System.out.println("{\n" +
                "  \"idAction\": \"" + idActionJson + "\",\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"preis\": " + preis + ",\n" +
                "  \"currency\": \"" + currency + "\"\n" +
                "}");
    }


}
