package io.vehicles.vehiclesIO.services;

import io.vehicles.vehiclesIO.entities.*;
import io.vehicles.vehiclesIO.enums.CarShape;
import io.vehicles.vehiclesIO.enums.GearType;
import io.vehicles.vehiclesIO.enums.MotorcycleShape;
import io.vehicles.vehiclesIO.files.FileDB;
import io.vehicles.vehiclesIO.repositories.*;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{
    private final VehicleRepository vehicleRepository;
    private final CarRepository carRepository;
    private final MotorcycleRepository motorcycleRepository;
    private final BicycleRepository bicycleRepository;
    private final TractorRepository tractorRepository;
    private final BoatRepository boatRepository;

    public static final String path = "C:\\Users\\apetr\\OneDrive\\Desktop\\SpringBoot\\vehiclesIOSpring\\src\\main\\resources\\file.txt";

    public VehicleServiceImpl(VehicleRepository vehicleRepository, CarRepository carRepository, MotorcycleRepository motorcycleRepository, BicycleRepository bicycleRepository, TractorRepository tractorRepository, BoatRepository boatRepository) {
        this.vehicleRepository = vehicleRepository;
        this.carRepository = carRepository;
        this.motorcycleRepository = motorcycleRepository;
        this.bicycleRepository = bicycleRepository;
        this.tractorRepository = tractorRepository;
        this.boatRepository = boatRepository;
    }

    @Override
    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public void updateVehicle(long id, Vehicle vehicle) {
        Vehicle updatedVehicle = vehicleRepository.findById(id);
        updatedVehicle.setModel(vehicle.getModel());
        updatedVehicle.setPrice(vehicle.getPrice());
        updatedVehicle.setBrand(vehicle.getBrand());
        vehicleRepository.save(updatedVehicle);
    }

    @Override
    public void deleteVehicleById(long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public void saveVehicleDB(){
        try{
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    getVehicleType(parts);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void getVehicleType(String[] array){
        String type = array[0];
        switch (type){
            case "Car":
                Car car = new Car(array[1], array[2], Integer.parseInt(array[3]), Integer.valueOf(array[4]), GearType.valueOf((array[5])), CarShape.valueOf(array[6]));
                carRepository.save(car);
                break;
            case "Motorcycle":
                Motorcycle motorcycle = new Motorcycle(array[1], array[2], Integer.parseInt(array[3]), Integer.parseInt(array[4]), MotorcycleShape.valueOf(array[5]));
                motorcycleRepository.save(motorcycle);
                break;
            case "Bicycle":
                Bicycle bicycle = new Bicycle(array[1], array[2], Integer.parseInt(array[3]));
                bicycleRepository.save(bicycle);
                break;
            case "Tractor":
                Tractor tractor = new Tractor(array[1], array[2], Integer.parseInt(array[3]), array[4]);
                tractorRepository.save(tractor);
                break;
            case "Boat":
                Boat boat = new Boat(array[1], array[2], Integer.parseInt(array[3]), array[4]);
                boatRepository.save(boat);
                break;
        }
    }
}
