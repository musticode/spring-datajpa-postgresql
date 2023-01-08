package com.springapp.repository;

import com.springapp.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> getByTypeLike(String type);
    List<Vehicle> getByModelCodeOrBrandName(String type);



}
