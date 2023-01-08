package com.springapp.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.springapp.entity.Vehicle;
import com.springapp.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {
    /**
     * get
     */


    private final VehicleRepository vehicleRepository; //req args


    public List<Vehicle> getVehicles(String type){
        return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> getById (Long id){
        return vehicleRepository.findById(id);
    }




}
