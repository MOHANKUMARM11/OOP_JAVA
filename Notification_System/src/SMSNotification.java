public class SMSNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("SMS Notification ");
        System.out.println(message);
    }

}
