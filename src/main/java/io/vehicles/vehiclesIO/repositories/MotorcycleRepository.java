package io.vehicles.vehiclesIO.repositories;

import io.vehicles.vehiclesIO.entities.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
    Motorcycle findById(long id);
}
