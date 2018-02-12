package com.capgemini.security;

import com.capgemini.person.traveller.Traveller;

public class HumanSecurity extends Security {

    //Op dit moment wordt deze klasse niet gebruikt
    private String humanFrisk;

    private String bodyScan;

    public HumanSecurity(Traveller traveller, String humanFrisk, String bodyScan) {
        super(traveller);
        this.humanFrisk = humanFrisk;
        this.bodyScan = bodyScan;
    }
}
