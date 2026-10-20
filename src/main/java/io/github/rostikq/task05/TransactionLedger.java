package io.github.rostikq.task05;

public interface TransactionLedger {
    void recordTransaction(String transactionId, double amount, String status);
}
