package com.example.uberApplication.repositories;

import com.example.uberApplication.entities.Driver;
import com.example.uberApplication.entities.Rating;
import com.example.uberApplication.entities.Ride;
import com.example.uberApplication.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
