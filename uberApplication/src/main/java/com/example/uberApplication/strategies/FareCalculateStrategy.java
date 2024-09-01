package com.example.uberApplication.strategies;

import com.example.uberApplication.dto.RideRequestDto;

public interface FareCalculateStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
