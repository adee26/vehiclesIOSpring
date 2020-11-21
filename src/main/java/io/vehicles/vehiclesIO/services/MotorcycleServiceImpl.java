package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Motorcycle;
import io.vehicles.vehiclesIO.repositories.MotorcycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleServiceImpl implements MotorcycleService{
    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleServiceImpl(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    @Override
    public List<Motorcycle> findAll() {
        return motorcycleRepository.findAll();
    }

    @Override
    public Motorcycle findById(long id) {
        return motorcycleRepository.findById(id);
    }

    @Override
    public void saveMotorcycle(Motorcycle motorcycle) {
        motorcycleRepository.save(motorcycle);
    }

    @Override
    public void updateMotorcycle(long id, Motorcycle motorcycle) {
        Motorcycle updatedMotorcycle = motorcycleRepository.findById(id);
        updatedMotorcycle.setMotorcycleShape(motorcycle.getMotorcycleShape());
        updatedMotorcycle.setTopSpeed(motorcycle.getTopSpeed());
        updatedMotorcycle.setBrand(motorcycle.getBrand());
        updatedMotorcycle.setPrice(motorcycle.getPrice());
        updatedMotorcycle.setModel(motorcycle.getModel());
        motorcycleRepository.save(updatedMotorcycle);
    }

    @Override
    public void deleteMotorcycleById(long id) {
        motorcycleRepository.deleteById(id);
    }
}
