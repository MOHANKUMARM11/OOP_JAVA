import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new SMSNotification());
        notifications.add(new WhatsAppNotification());
        notifications.add(new PushNotification());

        for (Notification notification : notifications) {
            notification.send("Hi This is Jack");
            System.out.println("------------------------------");
        }
    }
}
