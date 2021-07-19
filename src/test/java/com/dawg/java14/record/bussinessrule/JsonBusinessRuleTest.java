package com.dawg.java14.record.bussinessrule;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.vertafore.common.services.support.jackson.CommonObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import static com.google.common.io.Resources.getResource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonBusinessRuleTest {

    private BusinessRule businessRule;

    @BeforeEach
    void setUp() {
        businessRule = new BusinessRule("State", "MI",
                "ALLOW_LATE_RENEWAL", "Determine weather the state allows late renewals", "no comment");
    }

    @Test
    void testLicenseDataDetailResponseJsonSerialization() throws Exception {
        String expectedJson = readResourceFile("businessRule.json");

        ObjectMapper mapper = new CommonObjectMapper();
        String json = mapper.writeValueAsString(businessRule);

        System.out.println(json);

        assertEquals(expectedJson, json);
    }

    private String readResourceFile(String resourcePath) throws FileNotFoundException {
        URL url = getResource(resourcePath);
        File file = new File(url.getFile());
        StringBuilder fileContent = new StringBuilder();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine());
            }
        }

        return fileContent.toString();
    }
}
