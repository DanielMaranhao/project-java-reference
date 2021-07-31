package model.services;

public interface OnlinePaymentService {

	double interest(double value, int month);
	double paymentFee(double value);	
}
