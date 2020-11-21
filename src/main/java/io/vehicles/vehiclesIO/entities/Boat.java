package io.vehicles.vehiclesIO.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boat extends Vehicle{
    private String horsePower;

    public Boat() {
    }

    public Boat( String horsePower) {
        this.horsePower = horsePower;
    }

    public Boat(String brand, String model, Integer price, Long id1, String horsePower) {
        super(brand, model, price);
        this.horsePower = horsePower;
    }


    public String getHorsePower() {
        return horsePower;
    }

    public Boat setHorsePower(String horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    @Override
    public String toString() {
        return "Boat{" + super.toString() +
                ", horsePower='" + horsePower + '\'' +
                '}';
    }
}
