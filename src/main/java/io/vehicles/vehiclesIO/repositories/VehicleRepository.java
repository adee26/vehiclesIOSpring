package io.vehicles.vehiclesIO.repositories;

import io.vehicles.vehiclesIO.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long > {
    List<Vehicle> findAll();
    Vehicle findById(long id);
    Long countByBrand(String brand);
}
