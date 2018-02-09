package com.capgemini.person;

import com.capgemini.ENationality;

public class Person {

    // Properties

    private String firstName;

    private String lastName;

    private int age;

    private String dateOfBirth;

    private double phoneNumber;

    private double passportNumber;

    private ENationality eNationality;

    // Getters and setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(double passportNumber) {
        this.passportNumber = passportNumber;
    }

    public ENationality geteNationality() {
        return eNationality;
    }

    public void seteNationality(ENationality eNationality) {
        this.eNationality = eNationality;
    }
}
