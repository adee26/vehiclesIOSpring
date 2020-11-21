package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Tractor;

import java.util.List;


public interface TractorService {
    List<Tractor> findAll();
    Tractor findById(long id);
    void saveTractor(Tractor tractor);
    void updateTractor(long id, Tractor tractor);
    void deleteTractorById(long id);
}
