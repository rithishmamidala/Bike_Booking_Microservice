package com.Bike.PaymentService.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TypeModel {
    private Long userId;
    private String userName;
    private String bikeName;
    private Long bikeId;
    private Long cost;

}
