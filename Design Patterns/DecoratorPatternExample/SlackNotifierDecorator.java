public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendToSlack(message);
    }

    private void sendToSlack(String message) {
        System.out.println("Sending to Slack: " + message);
    }
}