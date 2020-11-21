package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {
    List<Vehicle> findAllVehicles();
    Vehicle getVehicleById(long id);
    void saveVehicle(Vehicle vehicle);
    void updateVehicle(long id, Vehicle vehicle);
    void deleteVehicleById(long id);
}
