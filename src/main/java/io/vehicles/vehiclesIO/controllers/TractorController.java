package io.vehicles.vehiclesIO.controllers;

import io.vehicles.vehiclesIO.entities.Tractor;
import io.vehicles.vehiclesIO.services.TractorService;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Track;
import java.util.List;

@RestController
@RequestMapping("api/v1/tractor")
public class TractorController {
    private final TractorService tractorService;

    public TractorController(TractorService tractorService) {
        this.tractorService = tractorService;
    }

    @PostMapping
    public void saveTractor(@RequestBody Tractor tractor){
        tractorService.saveTractor(tractor);
    }

    @GetMapping
    public List<Tractor> findAllTractors(){
        return tractorService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Tractor findTractorById(long id){
        return tractorService.findById(id);
    }

    @PostMapping(value = "/{id}")
    public void updateTractor(long id, @RequestBody Tractor tractor){
        tractorService.updateTractor(id, tractor);
    }

    @DeleteMapping
    public void deleteTractorById(long id){
        tractorService.deleteTractorById(id);
    }
}
