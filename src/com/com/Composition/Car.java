package com.com.Composition;

// inhertence example (is a)
public class Car extends Vehicle{   // has a "is a" relationship. a car "Is" a vehicle.
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
