package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Car;
import io.vehicles.vehiclesIO.repositories.CarRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(long id) {
        return carRepository.findById(id);
    }

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void updateCar(long id, Car car) {
        Car updatedCar = carRepository.findById(id);
        updatedCar.setCarShape(car.getCarShape());
        updatedCar.setGearType(car.getGearType());
        updatedCar.setTopSpeed(car.getTopSpeed());
        updatedCar.setBrand(car.getBrand());
        updatedCar.setModel(car.getModel());
        updatedCar.setPrice(car.getPrice());
        carRepository.save(updatedCar);
    }

    @Override
    public void deleteCarById(long id) {
        carRepository.deleteById(id);
    }
}
