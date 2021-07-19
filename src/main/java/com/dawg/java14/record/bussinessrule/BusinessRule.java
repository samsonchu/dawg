package com.dawg.java14.record.bussinessrule;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BusinessRule(
        @JsonProperty("ruleType")
        String ruleType,
        @JsonProperty("stateCode")
        String stateCode,
        @JsonProperty("typeCode")
        String typeCode,
        @JsonProperty("description")
        String description,
        @JsonProperty("comment")
        String comment) {
}

