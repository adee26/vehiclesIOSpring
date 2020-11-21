package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Motorcycle;
import io.vehicles.vehiclesIO.services.MotorcycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/motorcycle")
public class MotorcycleController {
    private final MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @PostMapping
    public void saveMotorcycle(@RequestBody Motorcycle motorcycle){
        motorcycleService.saveMotorcycle(motorcycle);
    }

    @GetMapping
    public List<Motorcycle> findAllMotorcycles(){
        return motorcycleService.findAll(); 
    }

    @GetMapping(value = "/{id}")
    public Motorcycle findMotorcycleById(@PathVariable long id){
        return motorcycleService.findById(id);
    }

    @PutMapping(value = "/{id}")
    public void updateMotorcycle(@PathVariable long id, @RequestBody Motorcycle motorcycle){
        motorcycleService.updateMotorcycle(id, motorcycle);
    }

    @DeleteMapping
    public void deleteMotorcycleById(long id){
        motorcycleService.deleteMotorcycleById(id);
    }


}
