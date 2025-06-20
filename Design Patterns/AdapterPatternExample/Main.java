public class Main {
    public static void main(String[] args){

        PayPalGateway payPal = new PayPalGateway();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);

        RazorpayGateway razorpay = new RazorpayGateway();
        PaymentProcessor razorpayAdapter = new RazorpayAdapter(razorpay);

        System.out.println("Using PayPal Adapter:");
        payPalAdapter.processPayment(1020.26);

        System.out.println("Using Razorpay Adapter:");
        razorpayAdapter.processPayment(1200.00);
    }
    
}
