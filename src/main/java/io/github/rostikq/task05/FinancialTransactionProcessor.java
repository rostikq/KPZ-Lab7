package io.github.rostikq.task05;

import java.util.Objects;

public class FinancialTransactionProcessor {
    private final PaymentGateway paymentGateway;
    private final TransactionLedger ledger;
    private final SmsNotifier smsNotifier;

    public FinancialTransactionProcessor(PaymentGateway paymentGateway,
                                         TransactionLedger ledger,
                                         SmsNotifier smsNotifier) {
        this.paymentGateway = Objects.requireNonNull(paymentGateway, "PaymentGateway required");
        this.ledger = Objects.requireNonNull(ledger, "TransactionLedger required");
        this.smsNotifier = Objects.requireNonNull(smsNotifier, "SmsNotifier required");
    }

    public void processPayment(PaymentRequest request) {
        if (request == null || request.getAmount() <= 0) {
            throw new IllegalArgumentException("Сума транзакції повинна бути більшою за нуль.");
        }

        boolean success = paymentGateway.executeCharge(request.getCardNumber(), request.getAmount());
        String status = success ? "SUCCESS" : "FAILED";

        ledger.recordTransaction(request.getTransactionId(), request.getAmount(), status);
        smsNotifier.sendSmsReceipt(request.getPayerPhone(), request.getTransactionId(), request.getAmount());
    }
}