package sirdarey.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import sirdarey.dto.FlightBookingRequest;
import sirdarey.dto.FlightBookingResponse;
import sirdarey.entity.Passenger;
import sirdarey.entity.Payment;
import sirdarey.exceptions.InsufficientFundsException;
import sirdarey.repository.PassengerRepo;
import sirdarey.repository.PaymentRepo;
import sirdarey.utils.PaymentUtils;

@Service
public class FlightBookingService {
	
	@Autowired
	PassengerRepo passengerRepo;
	@Autowired
	PaymentRepo paymentRepo;
	
	@Transactional(rollbackOn = InsufficientFundsException.class)
	public FlightBookingResponse getResponse (FlightBookingRequest request) throws InsufficientFundsException {
		
		Passenger getPassenger = request.getPassenger();
		getPassenger = passengerRepo.save(getPassenger);
		
		Payment getPayment = request.getPayment();
		PaymentUtils.validatePayment(getPayment.getAccountNo(), getPassenger.getFare()); //throws exception
		
		getPayment.setAmount(getPassenger.getFare());
		getPayment.setPassengerId(getPassenger.getPassengerId());
		paymentRepo.save(getPayment);
		
		return new FlightBookingResponse("BOOKING SUCCESSFUL", 
										getPassenger.getFare(),
										UUID.randomUUID().toString().split("-")[0],
										getPassenger);
	}
}
