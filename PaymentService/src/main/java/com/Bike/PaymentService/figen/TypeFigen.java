package com.Bike.PaymentService.figen;

import com.Bike.PaymentService.Client.TypeModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "TypeService", url = "http://localhost:9092/type")
public interface TypeFigen {

    @GetMapping("/all")
    public List<TypeModel> getType();
}
