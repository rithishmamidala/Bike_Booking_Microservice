package com.Bike.TypeService.feign;

import com.Bike.TypeService.Client.userModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "BikeService" , url = "http://localhost:9091/user")
public interface userFeign {
    @GetMapping("all")
    List<userModel> find();
}
