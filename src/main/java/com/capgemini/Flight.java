package com.capgemini;

public class Flight {

    // Properties

    private String destination;

    private String origin;

    private String flightID;

    private double arrivalTime;

    private double departureTime;

    public Vehicle aircraft; // change to aircraft identifier

    // Getters and setters

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public Vehicle getAircraft() {
        return aircraft;
    }

    public void setAircraft(Vehicle aircraft) {
        this.aircraft = aircraft;
    }
}
