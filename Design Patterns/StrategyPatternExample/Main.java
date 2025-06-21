public class Main{
    public static void main(String[] args) {
        
        PaymentContext context = new PaymentContext();

        System.out.println("User choosed Credict Card: ");
        context.setStrategy(new CreditCardPayment());
        context.executePayment(500.0);

        System.out.println("User choosed PayPal: ");
        context.setStrategy(new PayPalPayment());
        context.executePayment(300.0);

        System.out.println("User choosed no payment method: ");
        context.setStrategy(null);
        context.executePayment(100.0);
    }
}