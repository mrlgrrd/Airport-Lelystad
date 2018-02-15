package com.capgemini;


import com.capgemini.manager.AirportManager;
import com.capgemini.person.traveller.Traveller;


import java.util.ArrayList;

import com.capgemini.security.Security;


public class App {
    public static void main(String[] args) {


        System.out.println("Hello Lelystad!");

        AirportManager airportManager = new AirportManager();
        airportManager.startAirport();


    }


}



