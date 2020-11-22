package io.vehicles.vehiclesIO.entities;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "bicycleID")
@Table(name = "bicycle")
public class Bicycle extends Vehicle {
    public Bicycle() {
    }


    public Bicycle( String brand, String model, Integer price) {
        super( brand, model, price);
    }


    @Override
    public String toString() {
        return "Bicycle{" + super.toString() +
                '}';
    }
}
