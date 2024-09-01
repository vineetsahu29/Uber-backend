package com.example.uberApplication.strategies.Impl;

import com.example.uberApplication.dto.RideRequestDto;
import com.example.uberApplication.strategies.FareCalculateStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements FareCalculateStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
