package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Vehicle {
    private String owner;
    private double avgSpeed;


    public Vehicle(String owner, double avgSpeed) {
        this.owner = owner;
        this.avgSpeed = avgSpeed;
    }


    public abstract void honk();

    public void drive(String from, String to, double km) {
        LocalDateTime start = LocalDateTime.now();

        double durationHours = km / avgSpeed;
        long seconds = (long) (durationHours * 3600);

        LocalDateTime end = start.plusSeconds(seconds);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("From: " + from + " | Start: " + start.format(formatter));
        System.out.println("To: " + to + " | Arrival at: " + end.format(formatter));
        System.out.printf("Duration: %.2f hours%n", durationHours);
    }

    public String getOwner() {
        return owner;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }


}