public class PayPalGateway {
    public void sendPayment(String currency, double value) {
        System.out.println("Processing PayPal payment of " + value + " " + currency);
    }
}