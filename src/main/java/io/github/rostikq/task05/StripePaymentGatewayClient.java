package io.github.rostikq.task05;

public class StripePaymentGatewayClient implements PaymentGateway {
    @Override
    public boolean executeCharge(String cardNumber, double amount) {
        System.out.println("[Stripe API] Виконано списання " + amount + " UAH з картки " + cardNumber + ".");
        return true;
    }
}