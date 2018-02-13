package com.capgemini.security;

import com.capgemini.person.traveller.Traveller;

public class BaggageSecurity extends Security {

    //Op dit moment wordt deze klasse niet gebruikt.
    private String xray;

    private String manualBaggageSearch;

    public BaggageSecurity(Traveller traveller, String xray, String manualBaggageSearch) {
        super(traveller);
        this.xray = xray;
        this.manualBaggageSearch = manualBaggageSearch;
    }

}
