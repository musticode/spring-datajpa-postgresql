package com.springapp.controller;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.springapp.dto.VehicleDto;
import com.springapp.entity.Vehicle;
import com.springapp.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {
    /**
     * save update
     */

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto){
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setType(vehicle.getType());
        return vehicle;
    }

}
