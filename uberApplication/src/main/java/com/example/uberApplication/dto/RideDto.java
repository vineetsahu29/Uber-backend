package com.example.uberApplication.dto;


import com.example.uberApplication.entities.enums.PaymentMethod;
import com.example.uberApplication.entities.enums.RideStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {


    private Point pickUpLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private DriverDto driver;
    private RideStatus rideStatus;
    private PaymentMethod paymentMethod;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
