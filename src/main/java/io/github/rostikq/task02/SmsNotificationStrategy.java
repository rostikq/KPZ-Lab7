package io.github.rostikq.task02;

public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public boolean send(NotificationMessage message) {
        String body = message.getBody();
        String shortText = body.length() > 160 ? body.substring(0, 157) + "..." : body;
        System.out.println("[SMS] Phone: " + message.getRecipient());
        System.out.println("[SMS] Text: " + shortText);
        System.out.println("[SMS] Статус: Надіслано через GSM шлюз.");
        return true;
    }
}
