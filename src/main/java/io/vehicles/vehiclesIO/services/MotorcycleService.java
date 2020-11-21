package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Bicycle;
import io.vehicles.vehiclesIO.entities.Motorcycle;

import java.util.List;

public interface MotorcycleService {
    List<Motorcycle> findAll();
    Motorcycle findById(long id);
    void saveMotorcycle(Motorcycle motorcycle);
    void updateMotorcycle(long id, Motorcycle motorcycle);
    void deleteMotorcycleById(long id);
}
