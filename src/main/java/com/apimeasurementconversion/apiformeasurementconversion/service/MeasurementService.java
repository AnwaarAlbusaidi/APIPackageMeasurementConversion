package com.apimeasurementconversion.apiformeasurementconversion.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * A service class that performs processing on an array of integers.
 */
@Service
public class MeasurementService {
    private static final Logger logger = LoggerFactory.getLogger(MeasurementService.class);

    /**
     * Processes an array of integers and returns a processed result as a list.
     *
     * @param result The input array of integers to process.
     * @return The processed result as a list of integers.
     */
    public List<Integer> processResult(int[] result) {
        List<Integer> processedResult = new ArrayList<>();

        if (result.length == 0) {
            return processedResult; // Return an empty result if the input array is empty
        }

        int counter = result[0];

        if (counter == 0) {
            processedResult.add(0);
            return processedResult; // Return a single element list containing 0 if the first element is 0
        }

        if (counter > result.length - 1) {
            logger.info("Exception : counter can not be bigger than the array length");
            return processedResult; // Return an empty result if the counter exceeds the array length
        }

        for (int i = 1; i < result.length; i++) {
            int sum = 0;
            while (counter > 0 && i < result.length) {
                sum += result[i];
                counter--;
                i++;
            }

            processedResult.add(sum); // Add the sum to the processed result list

            if (i < result.length) {
                counter = result[i];
                if (counter == 0) {
                    processedResult.add(0);
                    return processedResult; // Return the result if the counter becomes 0 in the middle
                }
            }
        }
        logger.info("Processing the array of integers is done.");
        return processedResult;
    }
}
