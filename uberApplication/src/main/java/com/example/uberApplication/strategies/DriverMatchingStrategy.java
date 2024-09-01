package com.example.uberApplication.strategies;

import com.example.uberApplication.dto.RideRequestDto;
import com.example.uberApplication.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
