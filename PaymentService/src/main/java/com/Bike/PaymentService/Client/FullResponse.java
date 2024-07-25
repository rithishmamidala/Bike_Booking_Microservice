package com.Bike.PaymentService.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FullResponse {

    private Long bikeId;
    private String paymentType;
    private Long paymentNo;
   private List<TypeModel> type;
}
