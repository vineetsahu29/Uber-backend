package com.example.uberApplication.services.Impl;

import com.example.uberApplication.dto.DriverDto;
import com.example.uberApplication.dto.SignUpDto;
import com.example.uberApplication.dto.UserDto;
import com.example.uberApplication.services.AuthService;

public class AuthServiceImpl implements AuthService {
    @Override
    public String signIn(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onBoardDriver(Long userId) {
        return null;
    }
}
