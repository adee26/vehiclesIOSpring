package io.vehicles.vehiclesIO.entities;

import io.vehicles.vehiclesIO.enums.MotorcycleShape;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "motorcycleId")
@Table(name = "motorcycle")
public class Motorcycle extends Vehicle{
    private Integer topSpeed;

    @Enumerated(EnumType.STRING)
    private MotorcycleShape motorcycleShape;

    public Motorcycle() {
    }

//    public Motorcycle(Integer topSpeed, MotorcycleShape motorcycleShape) {
//        this.topSpeed = topSpeed;
//        this.motorcycleShape = motorcycleShape;
//    }

    public Motorcycle(String brand, String model, Integer price, Integer topSpeed, MotorcycleShape motorcycleShape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.motorcycleShape = motorcycleShape;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public Motorcycle setTopSpeed(Integer topSpeed) {
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
