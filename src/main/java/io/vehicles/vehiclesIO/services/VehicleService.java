package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Vehicle;
import io.vehicles.vehiclesIO.files.FileDB;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public interface VehicleService {
    List<Vehicle> findAllVehicles();
    Vehicle getVehicleById(long id);
    void saveVehicle(Vehicle vehicle);
    void updateVehicle(long id, Vehicle vehicle);
    void deleteVehicleById(long id);
    public void saveVehicleDB();
}
