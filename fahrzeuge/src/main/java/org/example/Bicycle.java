package org.example;

public class Bicycle extends Bike {
    public Bicycle(String owner, double avgSpeed, int seats) {
        if (seats < 1 || seats > 2) {
            System.out.println("Invaid amount of seats: " + seats + " -using default 2");
            seats = 2;
            // throw new IllegalArgumentException("Invlaid amount of seats: " + seats);
        }
        super(owner, avgSpeed, seats);

    }


    @Override
    public void push() {
        System.out.println("Pushing Bicycle");
    }

    @Override
    public void pedal() {
        System.out.println("Pedal on Bicycle used");
    }
}
