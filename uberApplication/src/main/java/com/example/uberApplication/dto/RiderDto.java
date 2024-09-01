package com.example.uberApplication.dto;

import com.example.uberApplication.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDto {

    private User user;
    private Double rating;

}
