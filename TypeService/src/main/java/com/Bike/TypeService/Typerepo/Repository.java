package com.Bike.TypeService.Typerepo;

import com.Bike.TypeService.Typemodel.TypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<TypeModel,Long> {


}
