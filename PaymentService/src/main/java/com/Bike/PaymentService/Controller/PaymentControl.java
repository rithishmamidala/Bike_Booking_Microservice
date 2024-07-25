package com.Bike.PaymentService.Controller;

import com.Bike.PaymentService.Client.FullResponse;
import com.Bike.PaymentService.Client.TypeModel;
import com.Bike.PaymentService.Model.Payment;
import com.Bike.PaymentService.PaymentServiceApplication;
import com.Bike.PaymentService.Repository.Repo;
import com.Bike.PaymentService.figen.TypeFigen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentControl {

    @Autowired
    private Repo repo;

    @Autowired
    private TypeFigen typeFigen;

    @GetMapping("/all")
    public List<Payment> findAll()
    {
        return repo.findAll();
    }


    @GetMapping("/payAll/{id}")
    public FullResponse find(@PathVariable("id") Long id)
    {
        Payment pay = repo.findById(id).orElse(null);
        List<TypeModel> type = typeFigen.getType();
        FullResponse res = new FullResponse();
        res.setBikeId(pay.getBikeId());
        res.setPaymentType(pay.getPaymentType());
        res.setPaymentNo(pay.getPaymentNo());
        res.setType(type);

        return res;


    }


    }

