package io.github.rostikq.task02;

// Опис предметної області: Мультиканальна система інформування користувачів.
// Завдання коду: Форматування та надсилання повідомлень через вибраний транспортний канал.
//
//


import java.util.Map;
import java.util.Objects;

public class NotificationSender {
    private final Map<NotificationChannel, NotificationStrategy> strategies;

    public NotificationSender(Map<NotificationChannel, NotificationStrategy> strategies) {
        this.strategies = Objects.requireNonNull(strategies);
    }

    public boolean send(NotificationMessage message, NotificationChannel channel) {
        NotificationStrategy strategy = strategies.get(channel);
        if (strategy == null) {
            throw new UnsupportedOperationException("Канал сповіщення " + channel + " не підтримується.");
        }
        return strategy.send(message);
    }
}