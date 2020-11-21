package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Bicycle;

import java.util.List;

public interface BicycleService {
    List<Bicycle> findAll();
    Bicycle findById(long id);
    void saveBicycle(Bicycle bicycle);
    void updateBicycle(long id, Bicycle bicycle);
    void deleteBicycleById(long id);
}
