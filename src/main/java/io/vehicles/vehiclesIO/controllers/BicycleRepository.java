package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Bicycle;
import io.vehicles.vehiclesIO.services.BicycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bicycle")
public class BicycleRepository {
    private final BicycleService bicycleService;

    public BicycleRepository(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @PostMapping
    public void saveBicycle(@RequestBody Bicycle bicycle){
        bicycleService.saveBicycle(bicycle);
    }

    @GetMapping
    public List<Bicycle> findAllBicycles(){
        return bicycleService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Bicycle findById(@PathVariable int id){
        return bicycleService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public void updateBicycle(@PathVariable int id, @RequestBody Bicycle bicycle){
        bicycleService.updateBicycle(id, bicycle);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteBicycleById(@PathVariable long id){
        bicycleService.deleteBicycleById(id);
    }
}
