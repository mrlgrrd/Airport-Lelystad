package com.capgemini;

public class TrafficControlTower {

    private EWindDirection windDirection;

    private double windSpeed;

    private boolean permissionToUseRunway;

    //private Plane plane;

    private Runway runway;
    
    public boolean askPermissionToLand(){
        // deze geeft boolean terug als runway free is
        // Hier moet if statements komen voor de runway
        return permissionToUseRunway;
    }

    public boolean askPermissionToTakeOff(){

        return permissionToUseRunway;
    }
}
