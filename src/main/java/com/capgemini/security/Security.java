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

    private boolean allowedToCheckIn;

    //Verboden handbagage
    private boolean forbiddenHandluggage;
    private boolean prosecuteHandLuggage;

    //Verboden substanties of items dat gevonden kan worden dmv bodyscan en frisk
    private boolean wearingForbiddenItems;
    private boolean prosecuteWearingForbiddenItems;


    //Geeft aan dat passagier door security heen is.
    public void checkSecurityClearance(Traveller traveller){
        checkedIn = traveller.isCheckedIn();
        forbiddenHandluggage = traveller.isForbiddenHandLuggage();
        wearingForbiddenItems = traveller.isWearingForbiddenItems();

        //Check of passagier is ingecheckt
        if(checkedIn){

            forbiddenHandluggage = searchBaggage(traveller);
            wearingForbiddenItems = searchBody(traveller);

            if(forbiddenHandluggage || wearingForbiddenItems){
                System.out.println("You are trying to bring forbidden items into the plane. No flight for you today!");
            } else {
                traveller.setSecurityClearance(true);
                System.out.println("You have cleared security, please proceed");
            }

        } else {
            System.out.println("You have not checked in yet. Please do that first");
        }


    }

    /**
     * In this method the baggage is searched (for exaample through x-ray and manual search)
     * @param traveller the information whether traveller is wearing forbidden items can be found in traveller
     * @return forbiddenHandLuggage returns whether forbidden handluggage is found.
     */
    public boolean searchBaggage(Traveller traveller){
        forbiddenHandluggage = traveller.isForbiddenHandLuggage();
        if(forbiddenHandluggage){
            prosecuteHandLuggage = traveller.isProsecuteHandLuggage();

            //If the traveller has to be prosecuted, he cannot get through security. Otherwise the forbidden items
            //are removed and forbidden Handluggage set to false
            if(prosecuteHandLuggage){
                System.out.println("We've found forbidden items in your luggage, please follow us");
            } else {
                System.out.println("You can't bring this on the plane, so we'll have to take it");
                forbiddenHandluggage = false;
            }
        }
        return forbiddenHandluggage;
    }

    /**
     * In this method the body is searched (for exaample through bodyscan and frisk )
     * @param traveller the information about whether the traveller is wearing forbidden items is saved here
     * @return wearingForbiddenItems returns whether the traveller is wearing forbidden items
     */
    public boolean searchBody(Traveller traveller){
        wearingForbiddenItems = traveller.isWearingForbiddenItems();
        if(wearingForbiddenItems){
            prosecuteWearingForbiddenItems = traveller.isProsecuteWearingForbiddenItems();
            //If the traveller has to be prosecuted, he cannot get through security. Otherwise the forbidden items
            //are removed and forbidden Handluggage set to false
            if(prosecuteWearingForbiddenItems){
                System.out.println("You we're wearing forbidden items, please follow us");
            } else {
                System.out.println("You can't bring this on the plane, so we'll have to take it");
                wearingForbiddenItems = false;
            }
        }
        return wearingForbiddenItems;
    }

}

//    //Code om te testen:
//    Traveller traveller = new Traveller();
//        traveller.setCheckedIn(false);
//                traveller.setWearingForbiddenItems(true);
//                traveller.setProsecuteWearingForbiddenItems(false);
//                traveller.setForbiddenHandLuggage(false);
//                traveller.setProsecuteHandLuggage(false);
//                Security security = new Security();
//                security.checkSecurityClearance(traveller);
//                CheckIn checkin = new CheckIn();
//                checkin.deskCheckIn(traveller);
//                security.checkSecurityClearance(traveller);


