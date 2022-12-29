package sirdarey.dto;

import sirdarey.entity.Passenger;

public class FlightBookingResponse {

	private String status;
	private Double totalFare;
	private String pnrNo;
	private Passenger passenger;
	
	public FlightBookingResponse () {}

	public FlightBookingResponse(String status, Double totalFare, String pnrNo, Passenger passenger) {
		this.passenger = passenger;
		this.status = status;
		this.totalFare = totalFare;
		this.pnrNo = pnrNo;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
}
