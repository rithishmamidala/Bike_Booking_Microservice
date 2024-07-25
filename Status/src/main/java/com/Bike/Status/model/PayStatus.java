package com.Bike.Status.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class PayStatus {
    @Id
    private Long paymentNo;
    private String paymentStatus;
}
