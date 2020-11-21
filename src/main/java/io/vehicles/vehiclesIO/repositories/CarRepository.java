package io.vehicles.vehiclesIO.repositories;

import io.vehicles.vehiclesIO.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CarRepository extends JpaRepository<Car, Long> {
    Car findById(long id);
}
