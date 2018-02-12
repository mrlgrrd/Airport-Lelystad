package com.capgemini.manager;

import com.capgemini.EWindDirection;
import com.capgemini.Runway;
import com.capgemini.TrafficControlTower;

public class AirportManager {

    // aanmaken nieuwe controle toren
    TrafficControlTower trafficControlTower = new TrafficControlTower();

    // aanmaken van nieuwe runways
    Runway runway1 = new Runway(EWindDirection.NORTH, false, false);
    Runway runway2 = new Runway(EWindDirection.SOUTH, false, false);

    // aanroepen van de peoplemanager om de travellers en employees aan te maken

    // aanroepen van de flightmanager om flights te genereren

    // aanroepen van de flightcompany manager om flightcompanies te genereren

    // aanroepen van vehiclemanager om vehicles te creëren
}
