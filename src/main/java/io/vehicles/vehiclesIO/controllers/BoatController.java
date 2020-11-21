package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Boat;
import io.vehicles.vehiclesIO.services.BoatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/boat")
public class BoatController {
    private final BoatService boatService;

    public BoatController(BoatService boatService) {
        this.boatService = boatService;
    }

    @PostMapping
    public void saveBoat(@RequestBody Boat boat){
        boatService.saveBoat(boat);
    }

    @GetMapping
    public List<Boat> findAllBoats(){
        return boatService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Boat findBoatById(@PathVariable long id){
        return boatService.findById(id);
    }

    @PostMapping("/{id}")
    public void updateBoat(@PathVariable long id,  @RequestBody  Boat boat){
        boatService.updateBoat(id, boat);
    }

    @DeleteMapping
    public void deleteBoatById(long id){
        boatService.deleteBoatById(id);
    }
}
