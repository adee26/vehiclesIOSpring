package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Vehicle;
import io.vehicles.vehiclesIO.files.FileDB;
import io.vehicles.vehiclesIO.files.StorageServiceImpl;
import io.vehicles.vehiclesIO.repositories.*;
import io.vehicles.vehiclesIO.services.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;
    private final CarRepository carRepository;
    private final BicycleRepository bicycleRepository;
    private final MotorcycleRepository motorcycleRepository;
    private final BoatRepository boatRepository;
    private final TractorRepository tractorRepository;
    private final VehicleRepository vehicleRepository;
    private final StorageServiceImpl storageService;

    public VehicleController(VehicleService vehicleService, CarRepository carRepository, BicycleRepository bicycleRepository, MotorcycleRepository motorcycleRepository, BoatRepository boatRepository, TractorRepository tractorRepository, VehicleRepository vehicleRepository, StorageServiceImpl storageService) {
        this.vehicleService = vehicleService;
        this.carRepository = carRepository;
        this.bicycleRepository = bicycleRepository;
        this.motorcycleRepository = motorcycleRepository;
        this.boatRepository = boatRepository;
        this.tractorRepository = tractorRepository;
        this.vehicleRepository = vehicleRepository;
        this.storageService = storageService;
    }

    @GetMapping(value = "/count")
    public HashMap<String, Long> countAll(){
        HashMap<String, Long> count = new HashMap<>();
        count.put("boat", boatRepository.count());
        count.put("car", carRepository.count());
        count.put("motorcycle", motorcycleRepository.count());
        count.put("tractor", tractorRepository.count());
        count.put("total",vehicleRepository.count() );
        return count;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Vehicle> getAllVehicles(){
        return vehicleService.findAllVehicles();
    }

    @GetMapping(value = "/countBrand")
    public HashMap<String, Long> countByBrand(){
        List<Vehicle> allVehicles = vehicleRepository.findAll();
        HashMap<String, Long> countBrand = new HashMap<>();
        for(Vehicle vehicle : allVehicles){
           if(countBrand.get(vehicle.getBrand()) == null){
               countBrand.put(vehicle.getBrand(), (long) 1);
           } else {
               countBrand.put(vehicle.getBrand(), countBrand.get(vehicle.getBrand()) + 1);
           }
        }
        return countBrand;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Vehicle getVehicleById(@PathVariable("id") int id){
        return vehicleService.getVehicleById(id);
    }

    @PostMapping
    public void createVehicle(@RequestBody Vehicle vehicle){
        vehicleService.saveVehicle(vehicle);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update (@PathVariable("id") long id, @RequestBody Vehicle vehicle){
        vehicleService.updateVehicle(id, vehicle);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable long id){
        vehicleService.deleteVehicleById(id);
    }

    @GetMapping(value = "/savefile")
    public void saveFileDB() {
        vehicleService.saveVehicleDB();
    }
}
