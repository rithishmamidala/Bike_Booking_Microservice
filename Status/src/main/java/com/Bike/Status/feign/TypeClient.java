package com.Bike.Status.feign;

import com.Bike.Status.client.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "PaymentService",url="http://localhost:9093/payment")
public interface TypeClient {

    @GetMapping("/all")
    List<Payment> getAllPayments();


}
