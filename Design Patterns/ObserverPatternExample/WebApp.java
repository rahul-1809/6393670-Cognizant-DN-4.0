public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[" + name + "] Alert: " + stockSymbol + " price changed to ₹" + price);
    }
}