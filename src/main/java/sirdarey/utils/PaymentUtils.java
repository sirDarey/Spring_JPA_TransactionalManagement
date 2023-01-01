package sirdarey.utils;

import java.util.HashMap;
import java.util.Map;

import sirdarey.exceptions.InsufficientFundsException;

public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();
	
	static {
		paymentMap.put("acc1", 5000.0);
		paymentMap.put("acc2", 2000.0);
		paymentMap.put("acc3", 50000.0);
		paymentMap.put("acc4", 25000.0);
	}
	
	public static void validatePayment (String accNo, double paidAmount) throws InsufficientFundsException {
		if (paidAmount > paymentMap.get(accNo))
			throw new InsufficientFundsException("You have Insufficient Funds for this Transaction");
	}
}
