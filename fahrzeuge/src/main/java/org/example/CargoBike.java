package org.example;

public class CargoBike extends Bike {
    private double load;


    public CargoBike(String owner, double avgSpeed, int seats) {
        super(owner, avgSpeed, seats);

        this.load = 0;
    }


    public void load(double kg) {
        load += kg;
        System.out.println("CargoBike loaded an extra " + kg + " kg.");
    }

    @Override
    public void honk() {
        System.out.println("CargoBike HONKING!");
    }

    @Override
    public void push() {
        System.out.println("Pushing CargoBike");
    }

    @Override
    public void pedal() {
        System.out.println("Pedal on CargoBike used");
    }

    public double getLoad() {
        return load;
    }
}
