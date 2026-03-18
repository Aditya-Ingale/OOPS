package Abstraction;

public class PaymentProcessor {
	void processPayment(Payment payment, double amount) {
		System.out.println("Processing payment....");
		payment.pay(amount);
	}
}
