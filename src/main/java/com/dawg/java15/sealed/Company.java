package com.dawg.java15.sealed;

public non-sealed class Company implements Entity{
    private String contactPersonName;

    public Company(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }
}
