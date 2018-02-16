package com.capgemini.manager;


import com.capgemini.CheckIn;
import com.capgemini.EWindDirection;
import com.capgemini.Runway;
import com.capgemini.TrafficControlTower;


public class AirportManager {
    // aanmaken nieuwe controle toren
    TrafficControlTower trafficControlTower = new TrafficControlTower();

    // aanmaken van nieuwe runways
    Runway runway1 = new Runway(EWindDirection.NORTH, false, false);
    Runway runway2 = new Runway(EWindDirection.SOUTH, false, false);

    // aanmaken van checkInDesk
    CheckIn checkInArea = new CheckIn();



    // aanroepen van de peoplemanager om de travellers en employees aan te maken
    public void makePeopleManager() {
        PeopleManager peopleManager = new PeopleManager();
    }

    // aanroepen van de flightmanager om flights te genereren

    // aanroepen van de flightcompany manager om flightcompanies te genereren

    // aanroepen van vehiclemanager om vehicles te creëren

    // start het vliegveld
    public void startAirport() {
        makePeopleManager();

    }

    public CheckIn getCheckInArea() {
        return checkInArea;
    }
}
