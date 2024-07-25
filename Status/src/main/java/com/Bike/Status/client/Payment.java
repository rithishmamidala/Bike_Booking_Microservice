package com.Bike.Status.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long userId;
    private String userName;
    private String bikeName;
    private Long bikeId;
    private Long cost;


}
