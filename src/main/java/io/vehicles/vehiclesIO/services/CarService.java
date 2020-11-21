package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Car;
import io.vehicles.vehiclesIO.entities.Vehicle;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();
    Car getCarById(long id);
    void saveCar(Car car);
    void updateCar(long id, Car car);
    void deleteCarById(long id);
}
