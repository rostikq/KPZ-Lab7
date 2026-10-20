package io.github.rostikq.task05;

public interface PaymentGateway {
    boolean executeCharge(String cardNumber, double amount);
}