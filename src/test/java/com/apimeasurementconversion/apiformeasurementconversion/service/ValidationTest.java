package com.apimeasurementconversion.apiformeasurementconversion.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    private Validation validation;

    @BeforeEach
    public void setUp() {
        validation = new Validation();
    }

    /**
     * Test case for validating a non-null and non-empty input string.
     */
    @Test
    public void testValidateInputString_NonEmpty() {
        // Arrange
        String input = "abc";

        // Act
        boolean result = validation.validateInputString(input);

        // Assert
        assertFalse(result);
    }

    /**
     * Test case for validating a null input string.
     */
    @Test
    public void testValidateInputString_Null() {
        // Arrange
        String input = null;

        // Act
        boolean result = validation.validateInputString(input);

        // Assert
        assertTrue(result);
    }

}