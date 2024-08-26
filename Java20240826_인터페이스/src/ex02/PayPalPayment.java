package ex02;

public class PayPalPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		
		System.out.printf("paypal으로 %.2f원을 결제합니다.\n", amount);
	}

}
