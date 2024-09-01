package com.example.uberApplication.services;

import com.example.uberApplication.dto.DriverDto;
import com.example.uberApplication.dto.RideDto;
import com.example.uberApplication.dto.RideRequestDto;
import com.example.uberApplication.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}

