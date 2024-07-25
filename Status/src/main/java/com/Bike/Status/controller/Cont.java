package com.Bike.Status.controller;


import com.Bike.Status.client.FullResponse;
import com.Bike.Status.client.Payment;
import com.Bike.Status.feign.TypeClient;
import com.Bike.Status.model.PayStatus;
import com.Bike.Status.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cont")


public class Cont {
    @Autowired
    private Repo repo;

    @Autowired
    private TypeClient typo;

    @GetMapping("/fetch/{id}")
    public FullResponse fetch(@PathVariable Long id)
    {
        PayStatus pays = repo.findById(id).orElse(null);
        List<Payment> l1 = typo.getAllPayments();
        FullResponse res = new FullResponse();

        res.setPaymentNo(pays.getPaymentNo());
        res.setPaymentStatus(pays.getPaymentStatus());
        res.setStats(l1);
        return res;

    }
    @GetMapping("/status")
    public List<PayStatus> retrieve()
    {
        return repo.findAll();
    }

}
