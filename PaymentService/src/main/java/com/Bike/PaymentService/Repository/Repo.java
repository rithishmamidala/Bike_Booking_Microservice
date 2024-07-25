package com.Bike.PaymentService.Repository;


import com.Bike.PaymentService.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Payment, Long> {
}
