package com.example.uberApplication.repositories;

import com.example.uberApplication.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Rider,Long> {
}
