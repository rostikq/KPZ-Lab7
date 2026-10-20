package io.github.rostikq.task05;

public class TwilioSmsNotifier implements SmsNotifier {
    @Override
    public void sendSmsReceipt(String phone, String transactionId, double amount) {
        System.out.println("[Twilio SMS] Повідомлення на " + phone + ": Платіж " + transactionId + " на суму " + amount + " UAH успішно виконано.");
    }
}