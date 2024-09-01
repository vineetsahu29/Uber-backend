package com.example.uberApplication.services;

import com.example.uberApplication.dto.DriverDto;
import com.example.uberApplication.dto.SignUpDto;
import com.example.uberApplication.dto.UserDto;

public interface AuthService {

    String signIn(String email, String password);

    UserDto signUp(SignUpDto signUpDto);

    DriverDto onBoardDriver(Long userId);

}
