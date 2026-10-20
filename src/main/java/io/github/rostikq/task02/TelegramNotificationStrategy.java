package io.github.rostikq.task02;

public class TelegramNotificationStrategy implements NotificationStrategy {
    @Override
    public boolean send(NotificationMessage message) {
        System.out.println("[TELEGRAM] ChatId: " + message.getRecipient());
        System.out.println("[TELEGRAM] Message: *" + message.getSubject() + "*\n" + message.getBody());
        System.out.println("[TELEGRAM] Статус: Надіслано через Bot API.");
        return true;
    }
}
