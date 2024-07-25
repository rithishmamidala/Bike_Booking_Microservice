package com.Bike.Status.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    private Long paymentNo;
    private String paymentStatus;
    List<Payment> stats;
}
