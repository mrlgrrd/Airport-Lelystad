package com.capgemini.security;

import com.capgemini.Security;

public class BaggageSecurity extends Security {

    private String xray;

    private String manualBaggageSearch;

    public BaggageSecurity(boolean checkedIn, boolean forbiddenLuggage) {
        super(checkedIn, forbiddenLuggage);
    }
}
