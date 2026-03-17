package org.example;

public class Address {
    private String zipCode;
    private String city;
    private String street;
    private int nr;


    public Address(String zipCode, String city, String street, int nr) {
        if (zipCode == null || zipCode.isBlank()) {
            System.out.println("ZipCode cant be empty!");
            // throw new IllegalArgumentException("ZipCode cant be empty!");
        }
        if (city == null || city.isBlank()) {
            System.out.println("City cant be empty!");
            // throw new IllegalArgumentException("City cant be empty!");
        }
        if (street == null || street.isBlank()) {
            System.out.println("Street cant be empty!");
            // throw new IllegalArgumentException("Street cant be empty!");
        }
        if (nr <= 0) {
            System.out.println("House number has to be higher than 0!");
            // throw new IllegalArgumentException("House number has to be higher than 0!");
        }

        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.nr = nr;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", nr=" + nr +
                '}';
    }
}