package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Vehicle;
import io.vehicles.vehiclesIO.repositories.VehicleRepository;
import io.vehicles.vehiclesIO.services.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Vehicle> getAllVehicles(){
        return vehicleService.findAllVehicles();
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


}
