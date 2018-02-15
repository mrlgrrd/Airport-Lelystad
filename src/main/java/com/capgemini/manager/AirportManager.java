package com.capgemini.manager;

import com.capgemini.*;
import com.capgemini.person.traveller.Traveller;
import com.capgemini.security.Security;

import java.util.ArrayList;

public class AirportManager {

    /**
     * create a list of travellers
     */

    Traveller traveller;
    CheckIn checkIn;

    // aanmaken nieuwe controle toren
    TrafficControlTower trafficControlTower = new TrafficControlTower();

    // aanmaken van nieuwe runways
    Runway runway1 = new Runway(EWindDirection.NORTH, false, false);
    Runway runway2 = new Runway(EWindDirection.SOUTH, false, false);

    // aanmaken van checkInDesk


    public void makeCheckIn() {
        CheckIn checkInArea = new CheckIn();
        this.checkIn = checkInArea;
        checkInArea.checkInDesk(this.traveller);
    }


    // creeren van de peoplemanager om de travellers en employees aan te maken

    private void makePeopleManager() {
        PeopleManager peopleManager = new PeopleManager();
        System.out.println("people manager made");
    }

    /**
     * this method creates the security
     */
    public void makeSecurity(){
        Security security = new Security();
        security.checkSecurityClearance(traveller);
    }

    // start het vliegveld
    public void startAirport() {
        makePeopleManager();
        makeTravellers();
        makeCheckIn();
        makeSecurity();
        makeCustoms();

    }

    public void makeTravellers() {
        // hier worden nieuwe travellers gegenereerd

        Traveller robbert = new Traveller(ECheckInType.SELFCHECKIN, false, true);
        this.traveller = robbert;
        System.out.println("robbert made");

    }

    public void makeCustoms(){
        Customs customs = new Customs();
        customs.checkEU();
    }

}
