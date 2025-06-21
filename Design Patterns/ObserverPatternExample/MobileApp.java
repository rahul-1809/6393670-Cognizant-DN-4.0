public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[" + name + "] Updated: " + stockSymbol + " is now ₹" + price);
    }
}