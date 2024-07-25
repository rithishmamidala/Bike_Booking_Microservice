package com.Bike.BikeService.userrepository;

import com.Bike.BikeService.usermodel.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<userModel, Long>{


}
