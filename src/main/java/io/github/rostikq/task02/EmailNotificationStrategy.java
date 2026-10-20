package io.github.rostikq.task02;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public boolean send(NotificationMessage message) {
        System.out.println("[EMAIL] To: " + message.getRecipient());
        System.out.println("[EMAIL] Subject: " + message.getSubject());
        System.out.println("[EMAIL] Body: " + message.getBody());
        System.out.println("[EMAIL] Статус: Відправлено через SMTP сервер.");
        return true;
    }
}
