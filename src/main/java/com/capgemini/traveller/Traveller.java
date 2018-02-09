package com.capgemini.traveller;

import com.capgemini.ENationality;
import com.capgemini.person.Person;

public class Traveller extends Person {

    // Constructor

    public Traveller(boolean isCheckedIn){
        this.isCheckedIn = isCheckedIn;
    }

    // Properties


    private String destination;

    private double passportNumber;

    private boolean isCheckedIn;

    private boolean hasPassedCustoms;

    private boolean hasBoardingPass;

    private boolean hasCarryOnLuggage;

    private boolean hasBaggage;

    private boolean needsAssistance;

    private boolean isHungry;

    private boolean isThirsty;

    private boolean needsBathroom;

    // Getters and setters

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public double getPassportNumber() {
        return passportNumber;
    }

    @Override
    public void setPassportNumber(double passportNumber) {
        this.passportNumber = passportNumber;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public boolean isHasPassedCustoms() {
        return hasPassedCustoms;
    }

    public void setHasPassedCustoms(boolean hasPassedCustoms) {
        this.hasPassedCustoms = hasPassedCustoms;
    }

    public boolean isHasBoardingPass() {
        return hasBoardingPass;
    }

    public void setHasBoardingPass(boolean hasBoardingPass) {
        this.hasBoardingPass = hasBoardingPass;
    }

    public boolean isHasCarryOnLuggage() {
        return hasCarryOnLuggage;
    }

    public void setHasCarryOnLuggage(boolean hasCarryOnLuggage) {
        this.hasCarryOnLuggage = hasCarryOnLuggage;
    }

    public boolean isHasBaggage() {
        return hasBaggage;
    }

    public void setHasBaggage(boolean hasBaggage) {
        this.hasBaggage = hasBaggage;
    }

    public boolean isNeedsAssistance() {
        return needsAssistance;
    }

    public void setNeedsAssistance(boolean needsAssistance) {
        this.needsAssistance = needsAssistance;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isThirsty() {
        return isThirsty;
    }

    public void setThirsty(boolean thirsty) {
        isThirsty = thirsty;
    }

    public boolean isNeedsBathroom() {
        return needsBathroom;
    }

    public void setNeedsBathroom(boolean needsBathroom) {
        this.needsBathroom = needsBathroom;
    }


    //
}
