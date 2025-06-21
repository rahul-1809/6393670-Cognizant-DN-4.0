public class Main {
    public static void main(String[] args) {
        
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("    Sending via Email    ");
        emailNotifier.send("Hello from normal email notifier.");

        Notifier emailWithSMS = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("\n    Sending via Email + SMS    ");
        emailWithSMS.send("New update available now.");

        Notifier fullNotifier = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                new EmailNotifier()));
        System.out.println("\n    Sending via Email + SMS + Slack    ");
        fullNotifier.send("System alert: This is high priority");
    }
}