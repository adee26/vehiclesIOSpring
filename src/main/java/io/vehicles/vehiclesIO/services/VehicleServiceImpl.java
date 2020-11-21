package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Vehicle;
import io.vehicles.vehiclesIO.repositories.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{
    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public void updateVehicle(long id, Vehicle vehicle) {
        Vehicle updatedVehicle = vehicleRepository.findById(id);
        updatedVehicle.setModel(vehicle.getModel());
        updatedVehicle.setPrice(vehicle.getPrice());
        updatedVehicle.setBrand(vehicle.getBrand());
        vehicleRepository.save(updatedVehicle);
    }

    @Override
    public void deleteVehicleById(long id) {
        vehicleRepository.deleteById(id);
    }
}
