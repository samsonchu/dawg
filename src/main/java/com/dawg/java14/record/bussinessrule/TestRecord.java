package com.dawg.java14.record.bussinessrule;

public class TestRecord {
    public static void main(String[] arguments) {
        BusinessRule businessRule1 = new BusinessRule("State", "MI",
                "ALLOW_LATE_RENEWAL", "Determine weather the state allows late renewals", "no comment");

        BusinessRule businessRule2 = new BusinessRule("State", "MI",
                "ALLOW_LATE_RENEWAL", "Determine weather the state allows late renewals", "no comment");

        System.out.println(businessRule1.toString());
        System.out.println();

    }
}
