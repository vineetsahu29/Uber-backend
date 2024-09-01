package com.example.uberApplication.strategies.Impl;

import com.example.uberApplication.dto.RideRequestDto;
import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
