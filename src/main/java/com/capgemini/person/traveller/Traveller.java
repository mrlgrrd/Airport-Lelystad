package com.capgemini.person.traveller;

import com.capgemini.ECheckInType;
import com.capgemini.EFlightDestinationType;
import com.capgemini.EIdentityType;
import com.capgemini.ENationality;
import com.capgemini.person.Person;

public class Traveller extends Person {

    // Constructor
    {
        System.out.println("A new traveller entered the airport.");
    }

    public Traveller() {
        checkInType = ECheckInType.SELFCHECKIN;
        isCheckedIn = false;
    }

    public Traveller(ECheckInType checkInType) {
        this.checkInType = checkInType;
        this.isCheckedIn = false;
    }

    // Properties

    private String destination;

    private EIdentityType identityType;

    private EFlightDestinationType flightDestinationType;

    private ECheckInType checkInType;

    private boolean isCheckedIn;

    private boolean hasBoardingPass;

    private boolean hasCarryOnLuggage;

    private boolean hasBaggage;

    private boolean baggageCheckedIn;

    private boolean needsAssistance;

    private boolean isHungry;

    private boolean isThirsty;

    private boolean needsBathroom;

    private boolean hasVisa;

    private boolean travellerOnPlane;

    // For Security
    private boolean forbiddenHandLuggage;
    private boolean prosecuteHandLuggage;
    private boolean wearingForbiddenItems;
    private boolean prosecuteWearingForbiddenItems;
    private boolean securityClearance;

    // For Customs
    // For Customs @ traveller you need to check if the visum date is before or on same date as departure date
    private boolean departureCountryVisum;
    private boolean isDateCorrectOfDeparture;

    // Getters and setters

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
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

    public boolean isHasVisa() {
        return hasVisa;
    }

    public void setHasVisa(boolean hasVisa) {
        this.hasVisa = hasVisa;
    }

    public boolean isTravellerOnPlane() {
        return travellerOnPlane;
    }

    public void setTravellerOnPlane(boolean travellerOnPlane) {
        this.travellerOnPlane = travellerOnPlane;
    }

    public boolean isDepartureCountryVisum() {
        return departureCountryVisum;
    }

    public void setDepartureCountryVisum(boolean departureCountryVisum) {
        this.departureCountryVisum = departureCountryVisum;
    }

    public boolean isDateCorrectOfDeparture() {
        return isDateCorrectOfDeparture;
    }

    public void setDateCorrectOfDeparture(boolean dateCorrectOfDeparture) {
        isDateCorrectOfDeparture = dateCorrectOfDeparture;
    }

    public boolean isForbiddenHandLuggage() {
        return forbiddenHandLuggage;
    }

    public void setForbiddenHandLuggage(boolean forbiddenHandLuggage) {
        this.forbiddenHandLuggage = forbiddenHandLuggage;
    }

    public boolean isWearingForbiddenItems() {
        return wearingForbiddenItems;
    }

    public void setWearingForbiddenItems(boolean wearingForbiddenItems) {
        this.wearingForbiddenItems = wearingForbiddenItems;
    }

    public boolean isSecurityClearance() {
        return securityClearance;
    }

    public void setSecurityClearance(boolean securityClearance) {
        this.securityClearance = securityClearance;
    }

    public EIdentityType getIdentityType() {
        return identityType;
    }

    public void setIdentityType(EIdentityType identityType) {
        this.identityType = identityType;
    }

    public EFlightDestinationType getFlightDestinationType() {
        return flightDestinationType;
    }

    public void setFlightDestinationType(EFlightDestinationType flightDestinationType) {
        this.flightDestinationType = flightDestinationType;
    }

    public ECheckInType getCheckInType() {
        return checkInType;
    }

    public void setCheckInType(ECheckInType checkInType) {
        this.checkInType = checkInType;
    }

    public boolean isBaggageCheckedIn() {
        return baggageCheckedIn;
    }

    public void setBaggageCheckedIn(boolean baggageCheckedIn) {
        this.baggageCheckedIn = baggageCheckedIn;
    }

    public boolean isProsecuteHandLuggage() {
        return prosecuteHandLuggage;
    }

    public void setProsecuteHandLuggage(boolean prosecuteHandLuggage) {
        this.prosecuteHandLuggage = prosecuteHandLuggage;
    }

    public boolean isProsecuteWearingForbiddenItems() {
        return prosecuteWearingForbiddenItems;
    }

    public void setProsecuteWearingForbiddenItems(boolean prosecuteWearingForbiddenItems) {
        this.prosecuteWearingForbiddenItems = prosecuteWearingForbiddenItems;
    }
}
