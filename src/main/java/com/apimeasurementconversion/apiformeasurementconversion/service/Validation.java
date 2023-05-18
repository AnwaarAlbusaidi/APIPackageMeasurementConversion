package com.apimeasurementconversion.apiformeasurementconversion.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * A service class that provides input validation functionality.
 */
@Service
public class Validation {

    private static final Logger logger = LoggerFactory.getLogger(MeasurementService.class);

    /**
     * Validates the input string.
     *
     * @param input The input string to be validated.
     * @return true if the input string is null , false otherwise.
     */
    public boolean validateInputString(String input) {
        if (input == null) {
            logger.info("Input string cannot be null.");
            return true;
        } else {
            return false;
        }
    }
}
