package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Bicycle;
import io.vehicles.vehiclesIO.entities.Boat;

import java.util.List;

public interface BoatService {
    List<Boat> findAll();
    Boat findById(long id);
    void saveBoat(Boat boat);
    void updateBoat(long id, Boat boat);
    void deleteBoatById(long id);
}
