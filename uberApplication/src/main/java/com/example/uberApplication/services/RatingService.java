package com.example.uberApplication.services;

import com.example.uberApplication.dto.DriverDto;
import com.example.uberApplication.dto.RiderDto;
import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.entities.Ride;
import com.example.uberApplication.entities.Rider;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
