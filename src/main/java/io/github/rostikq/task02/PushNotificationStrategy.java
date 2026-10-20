package io.github.rostikq.task02;

public class PushNotificationStrategy implements NotificationStrategy {
    @Override
    public boolean send(NotificationMessage message) {
        System.out.println("[PUSH] DeviceToken: " + message.getRecipient());
        System.out.println("[PUSH] Payload: { \"title\": \"" + message.getSubject() + "\", \"body\": \"" + message.getBody() + "\" }");
        System.out.println("[PUSH] Статус: Доставлено через Firebase Cloud Messaging.");
        return true;
    }
}
