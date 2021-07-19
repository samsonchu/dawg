package com.dawg.java14.record.bussinessrule.simple;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SimpleBusinessRuleTest {

    private BusinessRule businessRule;
    private BusinessRule businessRule1;

    @BeforeEach
    void setUp() {
        businessRule = new BusinessRule("State", "MI",
                "ALLOW_LATE_RENEWAL", "Determine weather the state allows late renewals", "no comment");
        businessRule1 = new BusinessRule("State", "MI",
                "ALLOW_LATE_RENEWAL", "Determine weather the state allows late renewals", "no comment");

    }

    @Test
    void verifyMapBillingContact() {
        System.out.println("ruleType: " + businessRule.ruleType());
        System.out.println("toString: " + businessRule.toString());

        assertFalse(businessRule == businessRule1);
        assertEquals(businessRule, businessRule1);
    }
}
