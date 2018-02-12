package com.capgemini;

public class AirportManager {

    // aanmaken nieuwe controle toren
    TrafficControlTower trafficControlTower = new TrafficControlTower();


    // aanmaken van nieuwe runways
    Runway runway1 = new Runway(EWindDirection.NORTH, false, false);
    Runway runway2 = new Runway(EWindDirection.SOUTH, false, false);

}
