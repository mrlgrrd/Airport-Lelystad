package com.capgemini;

import com.capgemini.person.traveller.Traveller;

public class Customs {

    private Traveller traveller;

    /**
     * Check if people European or Non-European
     * @param traveller
     */
    public void checkEU(Traveller traveller){
        if(traveller.isEU()){
            System.out.println("You can go to your gate");
            return;
        }

        checkVisumDate(traveller);
    }

    /**
     * Check when people are Non-European if visum date of departure is correct
     * @param traveller
     */
    public void checkVisumDate(Traveller traveller){
        if(!traveller.isDateCorrectOfDeparture()){
            System.out.println("You are going behind bars");
            return;
        }
        System.out.println("Go to gate");
    }

    public Traveller getTraveller() {
        return traveller;
    }

    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }
}

