package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Boat;
import io.vehicles.vehiclesIO.repositories.BoatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatServiceImpl implements BoatService {
    private final BoatRepository boatRepository;

    public BoatServiceImpl(BoatRepository boatRepository) {
        this.boatRepository = boatRepository;
    }

    @Override
    public List<Boat> findAll() {
        return boatRepository.findAll();
    }

    @Override
    public Boat findById(long id) {
        return boatRepository.findById(id);
    }

    @Override
    public void saveBoat(Boat boat) {
        boatRepository.save(boat);
    }

    @Override
    public void updateBoat(long id, Boat boat) {
        Boat updatedBoat = boatRepository.findById(id);
        updatedBoat.setHorsePower(boat.getHorsePower());
        updatedBoat.setBrand(boat.getBrand());
        updatedBoat.setModel(boat.getModel());
        updatedBoat.setPrice(boat.getPrice());
        boatRepository.save(boat);
    }

    @Override
    public void deleteBoatById(long id) {
        boatRepository.deleteById(id);
    }
}
