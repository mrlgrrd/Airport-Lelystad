package com.capgemini.security;

import com.capgemini.Security;

public class HumanSecurity extends Security {

    private String humanFrisk;

    private String bodyScan;

    public HumanSecurity(boolean checkedIn, boolean forbiddenLuggage) {
        super(checkedIn, forbiddenLuggage);
    }
}
