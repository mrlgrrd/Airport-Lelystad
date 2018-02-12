package com.capgemini;

import com.capgemini.person.traveller.Traveller;

public class Customs {

    private boolean passportChecked;

    private Traveller traveller;

    private Boardingpass boardingpass;

    // we are checking traveller if travelling to a European country or not
    public void checkEU(){
        //where are you going?
        if(boardingpass.isEU()){
            System.out.println("You can go to your gate");
        }

        // you are going outside the EU
        checkPassport();
    }

    // check the passport if visum was required, if so do check if traveller behaved according to visum standards
    public void checkPassport(){

        if(!traveller.isDateCorrectOfDeparture()){
            System.out.println("You are going behind bars");
            return;
        }

        System.out.println("Go to gate");

    }

    // getters and setters

    public boolean isPassportChecked() {
        return passportChecked;
    }

    public void setPassportChecked(boolean passportChecked) {
        this.passportChecked = passportChecked;
    }

    public Traveller getTraveller() {
        return traveller;
    }

    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }
}

