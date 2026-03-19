package org.example;

public abstract class Bike extends Vehicle {
    private int seats;


    public Bike(String owner, double avgSpeed, int seats) {
        super(owner, avgSpeed);

        this.seats = seats;
    }


    abstract void push();

    abstract void pedal();

    @Override
    public void honk() {
        System.out.println("Ring Ring!");
    }
}
