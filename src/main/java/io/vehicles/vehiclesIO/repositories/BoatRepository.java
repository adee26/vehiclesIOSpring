package io.vehicles.vehiclesIO.repositories;

import io.vehicles.vehiclesIO.entities.Boat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BoatRepository extends JpaRepository<Boat, Long> {
    List<Boat> findAll();
    Boat findById(long id);
}
