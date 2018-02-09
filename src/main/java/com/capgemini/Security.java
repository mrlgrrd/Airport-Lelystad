package com.capgemini;

import com.capgemini.person.personnel.Personnel;

public class Security {

    private String typePersonnel;

    private Personnel personnel;

    private String secLocation;

    private String secEmployeeAmount;

    private boolean securityClearance;

    private boolean checkedIn;

    //Verboden handbagage
    private boolean forbiddenHandluggage;

    //Verboden substanties of items dat gevonden kan worden dmv bodyscan en frisk
    private boolean wearingForbiddenItems;

    //Deze constructor zorgt er voor dat de boolean, of de passagier ingecheckt is, wordt meegegeven.

    public Security(boolean checkedIn, boolean forbiddenLuggage) {
        this.checkedIn = checkedIn;
        this.forbiddenHandluggage = forbiddenLuggage;
    }

    //Geeft aan dat passagier door security heen is.
    public boolean checkSecurityClearance(){

        //Check of passagier is ingecheckt
        if(this.checkedIn && !this.forbiddenHandluggage && !this.wearingForbiddenItems){
            this.securityClearance = true;
            System.out.println("Gefeliciteerd!!! U bent door de security");
        } else{
            if(this.forbiddenHandluggage || this.wearingForbiddenItems){
                this.securityClearance = false;
                System.out.println("U bent de lul, ga niet langs start, ga naar de gevangenis!!!");
            } else {
                this.securityClearance = false;
                System.out.println("Ga terug naar de incheckbalie");
            }

        }

        //Return boolean die aangeeft of de persoon door de security mag.
        return this.securityClearance;
    }

}
