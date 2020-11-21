package io.vehicles.vehiclesIO.entities;

import io.vehicles.vehiclesIO.enums.MotorcycleShape;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "motorcycleId")
@Table(name = "motorcycle")
public class Motorcycle extends Vehicle{
    private String topSpeed;
    private MotorcycleShape motorcycleShape;

    public Motorcycle() {
    }

    public Motorcycle(Long id, String topSpeed, MotorcycleShape motorcycleShape) {
        this.topSpeed = topSpeed;
        this.motorcycleShape = motorcycleShape;
    }

    public Motorcycle(Long id, String brand, String model, Integer price, Long id1, String topSpeed, MotorcycleShape motorcycleShape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.motorcycleShape = motorcycleShape;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public Motorcycle setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public MotorcycleShape getMotorcycleShape() {
        return motorcycleShape;
    }

    public void setMotorcycleShape(MotorcycleShape motorcycleShape) {
        this.motorcycleShape = motorcycleShape;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() +
                ", topSpeed='" + topSpeed + '\'' +
                ", motorcycleShape='" + motorcycleShape + '\'' +
                '}';
    }
}
