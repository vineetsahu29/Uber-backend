package com.example.uberApplication.services;

import com.example.uberApplication.dto.DriverDto;
import com.example.uberApplication.dto.RideDto;
import com.example.uberApplication.dto.RideRequestDto;
import com.example.uberApplication.dto.RiderDto;
import com.example.uberApplication.entities.Rider;
import com.example.uberApplication.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
