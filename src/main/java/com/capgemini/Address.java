package com.capgemini;

public class Address {

    // Constructor

    public Address(String streetName, int houseNumber, String postalCode, String city, String country) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    // Variables

    private String streetName;

    private int houseNumber;

    private String postalCode;

    private String city;

    private String country;

    // Getters and setters


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Methods

    public void printAddress(){
        System.out.println(streetName + houseNumber);
        System.out.println(postalCode + city);
        System.out.println(country);
    }
}
