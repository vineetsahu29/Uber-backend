package com.example.uberApplication.repositories;

import com.example.uberApplication.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
