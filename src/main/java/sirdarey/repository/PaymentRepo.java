package sirdarey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sirdarey.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, String>{

}
