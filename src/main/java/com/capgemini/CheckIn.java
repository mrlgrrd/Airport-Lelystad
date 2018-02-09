package com.capgemini;

public class CheckIn {
    // this boolean states if the traveller is allowed to use the self check in desk
    private boolean selfCheckIn;

    /*
     * method checkIn checks if the traveller is allready checked in.
     * If it is not checked in, the method looks if the passenger is allowed to use the self check in
     * If the passenger is allowed to use the self check in -> process self check in
     */


    //  public void checkIn() {

    // execute the self check in. check if self check in is allowed
    public void selfCheckIn(boolean selfCheckIn) {
        if (selfCheckIn) {
            this.selfCheckIn = true;
            System.out.println("You have checked yourself in");
        } else {
            System.out.println("You are not allowed to use Self Check In.");
        }
    }

    // execute the check in at the desk. check if the check in is allowed
    public void checkInDesk(boolean checkInDesk) {
        if (checkInDesk) {
            System.out.println("You have been checked in.");
        } else {
            System.out.println("You are not allowed to use the check in desk");
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
    // }
}
