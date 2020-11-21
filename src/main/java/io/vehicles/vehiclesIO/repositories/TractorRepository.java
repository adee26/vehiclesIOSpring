package io.vehicles.vehiclesIO.repositories;

import io.vehicles.vehiclesIO.entities.Tractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TractorRepository extends JpaRepository<Tractor, Long> {
}
