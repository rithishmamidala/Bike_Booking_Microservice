package com.Bike.TypeService.Typecontroller;


import com.Bike.TypeService.Client.FullResponse;
import com.Bike.TypeService.Client.userModel;
import com.Bike.TypeService.Typemodel.TypeModel;
import com.Bike.TypeService.Typerepo.Repository;
import com.Bike.TypeService.feign.userFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type")

public class Controller {

    @Autowired
    private Repository repo;

    @Autowired
    private userFeign fig;
    @GetMapping("/all")
    public List<TypeModel> getAllTypes() {
        return repo.findAll();
    }
    @GetMapping("/find/{id}")
    public FullResponse find(@PathVariable Long id)
    {
        TypeModel type = repo.findById(id).orElse(null);
        List<userModel> user = fig.find();
        FullResponse res = new FullResponse();
        res.setUserId(type.getUserId());
        res.setUserName(type.getUserName());
        res.setBikeName(type.getBikeName());
        res.setBikeId(type.getBikeId());
        res.setCost(type.getCost());
        res.setUser(user);
        return res;













    }


}
