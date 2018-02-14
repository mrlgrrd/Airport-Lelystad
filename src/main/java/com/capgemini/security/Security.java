package com.capgemini.security;


import com.capgemini.person.traveller.Traveller;

public class Security {

    // Op dit moment nog niet gebruikte variabelen: wellicht nog uitbreiden
    private String typePersonnel;
    //private Personnel personnel;
    private String secLocation;
    private String secEmployeeAmount;

    private Traveller traveller;

    private boolean securityClearance;

    private boolean checkedIn;

    //Verboden handbagage
    private boolean forbiddenHandluggage;

    //Verboden substanties of items dat gevonden kan worden dmv bodyscan en frisk
    private boolean wearingForbiddenItems;

    public Security(Traveller traveller) {
        this.traveller = traveller;

        //Dit nog even checken omdat de standaardwaardes op false staan (en dus hoeven deze niet per se geinitialiseerd
        // te worden om het te laten werken)
        this.checkedIn = traveller.isCheckedIn();
        this.forbiddenHandluggage = traveller.isForbiddenHandLuggage();
        this.wearingForbiddenItems = traveller.isWearingForbiddenItems();
    }

    //Geeft aan dat passagier door security heen is.
    public void checkSecurityClearance(){


        //Check of passagier is ingecheckt
        if(this.checkedIn){

            if(this.forbiddenHandluggage || this.wearingForbiddenItems){
                System.out.println("U bent de lul, ga niet langs start, ga naar de gevangenis!!!");
            } else {
                traveller.setSecurityClearance(true);
                System.out.println("Gefeliciteerd!!! U bent door de security");
            }

        } else {
            System.out.println("Ga terug naar de incheckbalie");
        }


    }

}

// Code om te testen:
//    Traveller traveller = new Traveller();
//        traveller.setCheckedIn(true);
//                traveller.setWearingForbiddenItems(true);
//                traveller.setForbiddenHandLuggage(false);
//                Security passenger1 = new Security(traveller);
//                passenger1.checkSecurityClearance();
//                System.out.println(traveller.isSecurityClearance());
