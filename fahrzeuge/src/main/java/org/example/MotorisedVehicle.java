package org.example;

public abstract class MotorisedVehicle extends Vehicle {
    private double km;
    private int ps;
    private int wheels;
    private int seats;


    public MotorisedVehicle(String owner, double avgSpeed, int ps, int wheels, int seats) {
        super(owner, avgSpeed);

        this.ps = ps;
        this.wheels = wheels;
        this.seats = seats;
        this.km = 0;
    }


    @Override
    public void drive(String from, String to, double km) {
        super.drive(from, to, km);
        this.km += km;
    }

    public double getKm() {
        return km;
    }

    public int getPs() {
        return ps;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }
}
