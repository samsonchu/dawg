package com.dawg.java14.record.bussinessrule.simple;

public record BusinessRule(
        String ruleType,
        String stateCode,
        String typeCode,
        String description,
        String comment) {
}

