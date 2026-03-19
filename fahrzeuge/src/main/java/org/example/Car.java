package org.example;

public class Car extends MotorisedVehicle {
    public Car(String owner, double avgSpeed, int ps, int seats) {
        super(owner, avgSpeed, ps, 4, seats);
    }


    public void fullThrottle() {
        System.out.println("Car goes full throttle!");
    }

    @Override
    public void honk() {
        System.out.println("CAR HONKING!");
    }
}
