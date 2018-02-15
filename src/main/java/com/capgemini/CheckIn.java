package com.capgemini;

import com.capgemini.person.traveller.Traveller;

import java.util.ArrayList;

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

    private Boardingpass boardingpass;

    private CheckIn checkInArea;

    private ArrayList<Traveller> checkedInTravellers = new ArrayList<Traveller>();

    /**
     * method checks the customer in.
     * If the customer is allowed to self check in, it will redirect to selfcheckin
     * selfcheckin starts baggage dropoff after completion
     * <p>
     * if the customer is not allowed to self check in, desk check in is executed
     * <p>
     * after a successfull check in the passenger is added to the list of checked in passengers
     * <p>
     * the check in method does not yet start the creation of the boarding pass!
     */
    public void initializeCheckIn(CheckIn checkIn) {
        this.checkInArea = checkIn;

    }

    public void checkInDesk(Traveller traveller) {

        if (!traveller.isCheckedIn() && ECheckInType.DESKCHECKIN.equals(traveller.getCheckInType())) {
            deskCheckIn(traveller);
            checkedInTravellers.add(traveller);
            return;
        }

        if (!traveller.isCheckedIn() && ECheckInType.SELFCHECKIN.equals(traveller.getCheckInType())) {
            selfCheckIn(traveller);
            checkedInTravellers.add(traveller);
            return;
        }

        if (traveller.isCheckedIn()) {
            System.out.println("You are already checked in! No need to do that again.");
            return;
        } else {
            System.out.println("You are not allowed to use the check in desk.");
            return;
        }
    }

    /**
     * execute the check in desk
     */
    public void deskCheckIn(Traveller traveller) {
        traveller.setCheckedIn(true);
        traveller.setBaggageCheckedIn(true);
        System.out.println("You and your baggage have been checked in. Please continue to Customs.");
    }

    /**
     * execute the self checkin
     */
    public void selfCheckIn(Traveller traveller) {
        if (!traveller.isCheckedIn() && ECheckInType.SELFCHECKIN.equals(traveller.getCheckInType())) {
            traveller.setCheckedIn(true);
            System.out.println("You have checked yourself in");
            dropBaggageOff(traveller);
        } else if (traveller.isCheckedIn()) {
            System.out.println("You have already been checked in.");
        } else {
            System.out.println("You are not allowed to use the self Check-in desk.");
        }
    }

    /**
     * execute the baggage drop off. check if the baggage drop off is allowed
     */

    public void dropBaggageOff(Traveller traveller) {
        if (traveller.isHasBaggage()) {
            traveller.setBaggageCheckedIn(true);
            System.out.println("Thank you for dropping off your baggage, please continue to Customs.");
            return;
        } else if (!traveller.isHasBaggage()) {
            traveller.setBaggageCheckedIn(true);
            System.out.println("You have no luggage to check in, please continue to Customs.");
            return;
        } else {
            System.out.println("You are not allowed to use baggage drop off.");
        }
    }
}




