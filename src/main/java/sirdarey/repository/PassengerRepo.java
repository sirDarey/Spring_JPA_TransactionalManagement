package sirdarey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sirdarey.entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Long>{

}
