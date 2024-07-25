package com.Bike.Status.repository;

import com.Bike.Status.model.PayStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<PayStatus,Long> {
}
