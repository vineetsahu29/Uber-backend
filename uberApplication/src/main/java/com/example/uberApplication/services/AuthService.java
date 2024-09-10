package com.example.uberApplication.services;

import com.example.uberApplication.dto.DriverDto;
import com.example.uberApplication.dto.SignupDto;
import com.example.uberApplication.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

    String refreshToken(String refreshToken);
}
