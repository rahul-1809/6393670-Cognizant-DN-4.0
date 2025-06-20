public class RazorpayAdapter implements PaymentProcessor {
    private final RazorpayGateway razorpay;

    public RazorpayAdapter(RazorpayGateway razorpay) {
        this.razorpay = razorpay;
    }

    @Override
    public void processPayment(double amount) {
        razorpay.initiateTransaction(amount);
    }
}