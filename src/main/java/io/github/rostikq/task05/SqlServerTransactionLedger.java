package io.github.rostikq.task05;

public class SqlServerTransactionLedger implements TransactionLedger {
    @Override
    public void recordTransaction(String transactionId, double amount, String status) {
        System.out.println("[SQL Server Ledger] Записано транзакцію " + transactionId + ": сума=" + amount + ", статус=" + status + ".");
    }
}