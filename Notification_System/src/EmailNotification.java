public class EmailNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Email Notification ");
        System.out.println(message);
    }

}
