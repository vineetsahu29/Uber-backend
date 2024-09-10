package com.example.uberApplication.strategies;

import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
