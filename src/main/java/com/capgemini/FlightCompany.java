package com.capgemini;

public class FlightCompany {

    // Constructor

    public FlightCompany(String companyName){
        this.companyName = companyName;
    }

    // Properties
    private String companyName;

    private ENationality enationality;

    private int numberOfAircraft;

    private double vatNumber;

    private double totalNumberOfPersonnel;

    // Getters and setters


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ENationality getEnationality() {
        return enationality;
    }

    public void setEnationality(ENationality enationality) {
        this.enationality = enationality;
    }

    public int getNumberOfAircraft() {
        return numberOfAircraft;
    }

    public void setNumberOfAircraft(int numberOfAircraft) {
        this.numberOfAircraft = numberOfAircraft;
    }

    public double getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(double vatNumber) {
        this.vatNumber = vatNumber;
    }

    public double getTotalNumberOfPersonnel() {
        return totalNumberOfPersonnel;
    }

    public void setTotalNumberOfPersonnel(double totalNumberOfPersonnel) {
        this.totalNumberOfPersonnel = totalNumberOfPersonnel;
    }
}
