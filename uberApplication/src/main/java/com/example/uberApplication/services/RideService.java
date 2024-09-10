package com.example.uberApplication.services;

import com.example.uberApplication.dto.RideRequestDto;
import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.entities.Ride;
import com.example.uberApplication.entities.RideRequest;
import com.example.uberApplication.entities.Rider;
import com.example.uberApplication.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
