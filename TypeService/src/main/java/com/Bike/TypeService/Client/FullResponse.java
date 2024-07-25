package com.Bike.TypeService.Client;

import com.Bike.TypeService.Typemodel.TypeModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FullResponse {
    private Long userId;
    private String userName;
    private String bikeName;
    private Long bikeId;
    private Long cost;
    private List<userModel> user;
}
