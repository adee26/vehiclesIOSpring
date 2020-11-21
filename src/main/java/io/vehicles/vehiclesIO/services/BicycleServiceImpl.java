package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Bicycle;
import io.vehicles.vehiclesIO.repositories.BicycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleServiceImpl implements BicycleService{
    private final BicycleRepository bicycleRepository;

    public BicycleServiceImpl(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    @Override
    public List<Bicycle> findAll() {
        return bicycleRepository.findAll();
    }

    @Override
    public Bicycle findById(long id) {
        return bicycleRepository.findById(id);
    }

    @Override
    public void saveBicycle(Bicycle bicycle) {
        bicycleRepository.save(bicycle);
    }

    @Override
    public void updateBicycle(long id, Bicycle bicycle) {
        Bicycle updatedBicycle = bicycleRepository.findById(id);
        updatedBicycle.setBrand(bicycle.getBrand());
        updatedBicycle.setModel(bicycle.getModel());
        updatedBicycle.setPrice(bicycle.getPrice());
        bicycleRepository.save(updatedBicycle);
    }

    @Override
    public void deleteBicycleById(long id) {
        bicycleRepository.deleteById(id);
    }
}
