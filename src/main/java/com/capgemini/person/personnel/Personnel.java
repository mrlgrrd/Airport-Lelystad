package com.capgemini.person.personnel;

import com.capgemini.ENationality;
import com.capgemini.person.Person;

public class Personnel extends Person {
        private String name;
        private String IDnumberPersonnel;
        private String eMailAddress;
        private String phoneNumber;
        private String birthOfDate;
        private String department;
        private String location;
        private ENationality nationality;

        // also have extention of job types like pilot
        private String jobType;

        // private Address address;

        // when going through security
        private boolean securityClearance;
        private boolean badge;




}
