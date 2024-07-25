package com.Bike.PaymentService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Payment {

    @Id
    private Long bikeId;
    private String paymentType;
    private Long paymentNo;


}
