package com.capgemini;

import com.capgemini.person.traveller.Traveller;

public class CheckIn {

    private Traveller traveller;

    // execute the self check in. check if self check in is allowed
    public void selfCheckIn(boolean selfCheckIn) {
        if (selfCheckIn) {
            System.out.println("You have checked yourself in");
        } else {
            System.out.println("You are not allowed to use Self Check In.");
        }
    }

    // execute the check in at the desk. check if the check in is allowed
    public void checkInDesk(boolean isCheckedIn) {
        if (!isCheckedIn) {
            isCheckedIn = true;
            System.out.println("You have been checked in.");
        } if (isCheckedIn) {
            System.out.println("You are already checked in! No need to do that again.");
        } else {
            System.out.println("You are not allowed to use the check in desk.");
        }
    }

    // execute the baggage drop off. check if the baggage drop off is allowed
    public void dropBaggageOff(boolean baggageDroppedOff) {
        if (baggageDroppedOff) {
            System.out.println("Thank you for dropping off your baggage");
        } else {
            System.out.println("You are not allowed to use baggage drop off.");
        }
    }
}
