package sirdarey.dto;

import sirdarey.entity.Passenger;
import sirdarey.entity.Payment;

public class FlightBookingRequest {

	private Passenger passenger;
	private Payment payment;
	
	public FlightBookingRequest() {}

	public FlightBookingRequest(Passenger passenger, Payment payment) {
		this.passenger = passenger;
		this.payment = payment;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
