package com.capgemini.traveller;

import com.capgemini.ENationality;
import com.capgemini.Person;

public class Traveller extends Person {

    // Constructor
    {
        System.out.println("A new traveller entered the airport.");
    }
    public Traveller(boolean isCheckedIn){
        this.isCheckedIn = isCheckedIn;
    }

    // Properties


    private String destination;

    private double passportNumber;

    private boolean isCheckedIn;

    private boolean hasBoardingPass;

    private boolean hasCarryOnLuggage;

    private boolean hasBaggage;

    private boolean needsAssistance;

    private boolean isHungry;

    private boolean isThirsty;

    private boolean needsBathroom;

    // Getters and setters

    //
}
