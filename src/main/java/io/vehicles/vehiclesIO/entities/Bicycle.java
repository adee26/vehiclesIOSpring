package io.vehicles.vehiclesIO.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicycle extends Vehicle {
    public Bicycle() {
    }


    public Bicycle( String brand, String model, Integer price, int bicycleId) {
        super( brand, model, price);
    }


    @Override
    public String toString() {
        return "Bicycle{" + super.toString() +
                '}';
    }
}
