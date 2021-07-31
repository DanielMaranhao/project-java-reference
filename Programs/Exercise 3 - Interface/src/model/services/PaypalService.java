package model.services;

public class PaypalService implements OnlinePaymentService {
	
	private static final double MONTHLY_INTEREST = 0.01;
	private static final double FEE_PERCENTAGE = 0.02;	

	@Override
	public double interest(double value, int month) {
		return value * MONTHLY_INTEREST * month;
	}

	@Override
	public double paymentFee(double value) {
		return value * FEE_PERCENTAGE;
	}
}
