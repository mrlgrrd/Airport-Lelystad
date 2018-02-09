package com.capgemini;

import com.capgemini.traveller.Traveller;

public class Customs {

    private boolean passportChecked;

    private Traveller traveller;


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

