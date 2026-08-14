public class PushNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Push Notification");
        System.out.println(message);
    }
}