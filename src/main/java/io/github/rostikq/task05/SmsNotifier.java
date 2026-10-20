package io.github.rostikq.task05;

public interface SmsNotifier {
    void sendSmsReceipt(String phone, String transactionId, double amount);
}
