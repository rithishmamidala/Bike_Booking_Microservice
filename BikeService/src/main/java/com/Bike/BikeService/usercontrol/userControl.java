package com.Bike.BikeService.usercontrol;

import com.Bike.BikeService.usermodel.userModel;
import com.Bike.BikeService.userrepository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class userControl {

    @Autowired
    private userRepo repo;

    @PostMapping("/add")
    public userModel addUser(@RequestBody userModel user){
        return repo.save(user);
    }
    @GetMapping("/all")
    public List<userModel> list(){
        return repo.findAll();
    }
}
