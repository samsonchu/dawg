package com.dawg.java15.instantof;

import com.dawg.java15.sealed.Company;
import com.dawg.java15.sealed.Entity;
import com.dawg.java15.sealed.Individual;

public class testInstanceof {
    public static void main(String... args) {
        Entity entity = new Company("John Smith");

        if (entity instanceof Company) {
            Company company = (Company) entity;
            String name = company.getContactPersonName();
            //do something
        } else if (entity instanceof Individual) {
            Individual individual = (Individual) entity;
            //do something
        }

        if (entity instanceof Company company) {
            String name = company.getContactPersonName();
            //do something
        } else if (entity instanceof Individual individual) {
            //do something
        }
    }
}
