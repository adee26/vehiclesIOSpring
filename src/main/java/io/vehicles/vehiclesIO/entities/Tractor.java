package io.vehicles.vehiclesIO.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tractor extends Vehicle{

    private String cylindricalCapacity;

    public Tractor() {
    }

    public Tractor(String cylindricalCapacity) {
        this.cylindricalCapacity = cylindricalCapacity;
    }

    public Tractor(String brand, String model, Integer price,  String cylindricalCapacity) {
        super(brand, model, price);
        this.cylindricalCapacity = cylindricalCapacity;
    }


    public String getCylindricalCapacity() {
        return cylindricalCapacity;
    }

    public Tractor setCylindricalCapacity(String cylindricalCapacity) {
        this.cylindricalCapacity = cylindricalCapacity;
        return this;
    }

    @Override
    public String toString() {
        return "Tractor{" + super.toString() +
                ", cylindricalCapacity='" + cylindricalCapacity + '\'' +
                '}';
    }
}
