package sirdarey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sirdarey.dto.FlightBookingRequest;
import sirdarey.dto.FlightBookingResponse;
import sirdarey.services.FlightBookingService;

@RestController
public class FlightBookingController {
	
	@Autowired
	FlightBookingService service;
	
	@PostMapping("/book_flight")
	public FlightBookingResponse bookFlight(@RequestBody FlightBookingRequest request) {
		return service.getResponse(request);
	}
}
