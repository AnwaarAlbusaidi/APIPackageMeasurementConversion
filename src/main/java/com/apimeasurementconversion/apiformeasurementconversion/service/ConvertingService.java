package com.apimeasurementconversion.apiformeasurementconversion.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConvertingService {
    private static final Logger logger = LoggerFactory.getLogger(MeasurementService.class);

    /**
     * Converts a string to an array of integers.
     *
     * @param input The input string to convert.
     * @return An array of integers representing the converted string.
     */
    public int[] convertString(String input) {

        List<Integer> resultList = new ArrayList<>();
        int count = 0;
        boolean combineWithZ = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'z') {
                if (i + 1 < input.length() && input.charAt(i + 1) != 'z') {
                    combineWithZ = true; // Mark to combine with 'z' later
                }
                count++;
            } else {
                if (count > 0 && combineWithZ) {
                    if (input.charAt(i) == '_') {
                        resultList.add(count * 26 + 0); // Add combined value (count * 26) with 0 for '_'
                        i = i + 1; // Skip the '_'
                        count = 0;
                        combineWithZ = false;
                    } else {
                        resultList.add(count * 26 + (input.charAt(i) - 'a' + 1)); // Add combined value (count * 26) with character value
                        i = i + 1; // Skip the character
                        count = 0;
                        combineWithZ = false;
                    }
                } else if (count > 0) {
                    resultList.add(count * 26); // Add value (count * 26)
                    count = 0;
                }
                if (input.charAt(i) == '_') {
                    resultList.add(0); // Add 0 for '_'
                }
                if (Character.isAlphabetic(input.charAt(i))) {
                    resultList.add(input.charAt(i) - 'a' + 1); // Add character value
                }
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i); // Convert the list to an array
        }

        logger.info("Converting the string to an array of integers is done.");
        return result;
    }
}
