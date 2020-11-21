package io.vehicles.vehiclesIO.repositories;

import io.vehicles.vehiclesIO.entities.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BicycleRepository extends JpaRepository<Bicycle, Long> {
    Bicycle findById(long id);
}
