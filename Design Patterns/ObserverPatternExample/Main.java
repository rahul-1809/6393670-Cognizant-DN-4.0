public class Main {
    public static void main(String[] args) {
        
        StockMarket stock = new StockMarket("INFY", 1500.0);

        Observer mobileUser1 = new MobileApp("Mobile User 1");
        Observer mobileUser2 = new MobileApp("Mobile User 2");
        Observer webUser1 = new WebApp("Dashboard");

        stock.register(mobileUser1);
        stock.register(mobileUser2);
        stock.register(webUser1);

        System.out.println("Updating INFY price to ₹1550");
        stock.setPrice(1550.0);

        System.out.println("\nUnregistering Mobile User 2");
        stock.deregister(mobileUser2);

        System.out.println("\nUpdating INFY price to ₹1600");
        stock.setPrice(1600.0);
    }
}
