public class WhatsAppNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("WhatsApp Notification ");
        System.out.println(message);
    }

}
