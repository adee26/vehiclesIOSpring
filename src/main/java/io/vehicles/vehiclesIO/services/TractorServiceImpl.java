package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.Tractor;
import io.vehicles.vehiclesIO.repositories.TractorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TractorServiceImpl implements TractorService {
    private final TractorRepository tractorRepository;

    public TractorServiceImpl(TractorRepository tractorRepository) {
        this.tractorRepository = tractorRepository;
    }

    @Override
    public List<Tractor> findAll() {
        return tractorRepository.findAll();
    }

    @Override
    public Tractor findById(long id) {
        return tractorRepository.findById(id);
    }

    @Override
    public void saveTractor(Tractor tractor) {
       tractorRepository.save(tractor);

    }

    @Override
    public void updateTractor(long id, Tractor tractor) {
        Tractor updatedTractor = tractorRepository.findById(id);
        updatedTractor.setCylindricalCapacity(tractor.getCylindricalCapacity());
        updatedTractor.setBrand(tractor.getBrand());
        updatedTractor.setModel(tractor.getModel());
        updatedTractor.setPrice(tractor.getPrice());
    }

    @Override
    public void deleteTractorById(long id) {
        tractorRepository.deleteById(id);
    }
}
