package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {		
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, int months) {		
		double baseValue = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {			
			Date date = addMonths(contract.getDate(), i);
			double updatedValue = baseValue + paymentService.interest(baseValue, i);
			double fullValue = updatedValue + paymentService.paymentFee(updatedValue);
			contract.addInstallment(new Installment(date, fullValue));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
