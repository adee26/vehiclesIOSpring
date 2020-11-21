package io.vehicles.vehiclesIO.entities;

import io.vehicles.vehiclesIO.enums.GearType;
import io.vehicles.vehiclesIO.enums.CarShape;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "carId")
@Table(name = "car")
public class Car extends Vehicle{
    private int topSpeed;
    @Enumerated(EnumType.STRING)
    private GearType gearType;
    @Enumerated(EnumType.STRING)
    private CarShape carShape;

    public Car() {
    }

    public Car(int topSpeed, GearType gearType, CarShape carShape) {
        this.topSpeed = topSpeed;
        this.gearType = gearType;
        this.carShape = carShape;
    }

    public Car(String brand, String model, Integer price, int topSpeed, GearType gearType, CarShape carShape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.gearType = gearType;
        this.carShape = carShape;
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public Car setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public GearType getGearType() {
        return gearType;
    }

    public Car setGearType(GearType gearType) {
        this.gearType = gearType;
        return this;
    }

    public CarShape getCarShape() {
        return carShape;
    }

    public Car setCarShape(CarShape carShape) {
        this.carShape = carShape;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", topSpeed='" + topSpeed + '\'' +
                ", gearType=" + gearType +
                ", carShape=" + carShape +
                '}';
    }
}
