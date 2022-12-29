package sirdarey.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passengerId;
	private String name;
	private String email;
	private String source;
	private String destination;
	
	@OneToMany
	@JoinColumn(name = "passengerId", referencedColumnName = "passengerId")
	private List<Payment> payments;
	
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private Date travelDate;
	
	private String pickUpTime;
	private String arrivalTime;
	private Double fare;
	
	public Passenger () {}

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}
}
