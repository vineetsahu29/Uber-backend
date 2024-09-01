package com.example.uberApplication.repositories;

import com.example.uberApplication.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride,Long> {
}
