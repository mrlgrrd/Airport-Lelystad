package com.capgemini;

import com.capgemini.person.traveller.Traveller;

/*
 * method checkIn checks if the traveller is already checked in.
 * If it is not checked in, the method looks if the passenger is allowed to use the self check in
 * If the passenger is allowed to use the self check in -> process self check in
 * After self check in, baggage drop off is mandatory
 *
 * If self check in is false, checkInDesk is mandatory
 */

public class CheckIn {

    private Traveller traveller;

    public void checkMeIn(ECheckInType checkInType) {
        if (checkInType == ECheckInType.SELFCHECKIN) {
            selfCheckIn();
            dropBaggageOff();
        }

   /* } else if(ECheckInType == ECheckInType.DESKCHECKIN)

    {
        checkInDesk();
    }

    else

    {
        System.out.println("Error checking in");
    }*/

    }

    // execute the self check in. check if self check in is allowed
    public void selfCheckIn() {
        if (!traveller.isCheckedIn()) {
            traveller.setCheckedIn(true);
            System.out.println("You have checked yourself in");
        } else {
            System.out.println("You are not allowed to use Self Check In.");
        }
    }

    // execute the baggage drop off. check if the baggage drop off is allowed
    public void dropBaggageOff() {
        if (traveller.isHasBaggage()) {
            traveller.setBaggageCheckedIn(true);
            System.out.println("Thank you for dropping off your baggage");
        } else {
            System.out.println("You are not allowed to use baggage drop off.");
        }
    }

    // execute the check in at the desk. check if the check in is allowed
    public void checkInDesk() {
        if (!traveller.isCheckedIn()) {
            traveller.setCheckedIn(true);
            traveller.setBaggageCheckedIn(true);
            System.out.println("You and your baggage have been checked in.");
        }
        if (traveller.isCheckedIn()) {
            System.out.println("You are already checked in! No need to do that again.");
        } else {
            System.out.println("You are not allowed to use the check in desk.");

        }
    }


}




