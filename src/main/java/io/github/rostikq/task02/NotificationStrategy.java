package io.github.rostikq.task02;

public interface NotificationStrategy {
    boolean send(NotificationMessage message);
}
