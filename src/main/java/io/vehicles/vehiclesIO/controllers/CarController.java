package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Car;
import io.vehicles.vehiclesIO.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars(){
        return carService.findAllCars();
    }

    @GetMapping(value = "/{id}")
    public Car getCarById(@PathVariable long id){
        return carService.getCarById(id);
    }

    @PostMapping
    public void saveCar(@RequestBody Car car){
        carService.saveCar(car);
    }

    @PutMapping(value = "/{id}")
    public void updateCar(@PathVariable long id, @RequestBody Car car){
        carService.updateCar(id, car);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCarById(@PathVariable long id){
        carService.deleteCarById(id);
    }
}
