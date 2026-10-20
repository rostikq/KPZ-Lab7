package io.github.rostikq.task05;

public class MainCompositionRoot {
    public static void main(String[] args) {
        PaymentGateway gateway = new StripePaymentGatewayClient();
        TransactionLedger ledger = new SqlServerTransactionLedger();
        SmsNotifier notifier = new TwilioSmsNotifier();

        FinancialTransactionProcessor processor = new FinancialTransactionProcessor(gateway, ledger, notifier);

        PaymentRequest request = new PaymentRequest("TX-10029", "4441111122223333", 1500.00, "+380971112233");
        processor.processPayment(request);
    }
}