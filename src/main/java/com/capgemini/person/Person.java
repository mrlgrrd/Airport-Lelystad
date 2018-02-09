package com.capgemini.person;

import com.capgemini.ENationality;

public class Person {

    public Person() {

    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    // Properties
    private String uniqueNumber;

    public String firstName;

    private String lastName;

    private int age;

    private String dateOfBirth;

    private double phoneNumber;

    private double passportNumber;

    private ENationality nationality;

    private String eMailAddress;

    // Getters and setters
    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

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
        return nationality;
    }

    public void seteNationality(ENationality eNationality) {
        this.nationality = eNationality;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

}
