package com.dawg.java15.sealed;

public sealed class Individual implements Entity permits Licensee, NonLicensee {
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
