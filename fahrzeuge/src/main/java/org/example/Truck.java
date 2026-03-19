package org.example;

public class Truck extends MotorisedVehicle {
    private double load;
    private boolean hasTrailer;


    public Truck(String owner, double avgSpeed, int ps, int seats, boolean hasTrailer) {
        super(owner, avgSpeed, ps, 6, seats);

        this.hasTrailer = hasTrailer;
        this.load = 0;
    }


    public void transport(double tons) {
        if (tons <= 10) {
            load += tons;
            System.out.println("Transporting " + tons + " tons.");
        } else {
            System.out.println("Too much load! Max 10 tons.");
        }
    }

    @Override
    public void honk() {
        System.out.println("TRUCK HONKING!");
    }
}
