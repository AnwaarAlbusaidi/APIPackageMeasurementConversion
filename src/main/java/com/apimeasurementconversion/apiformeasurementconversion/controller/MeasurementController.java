package com.apimeasurementconversion.apiformeasurementconversion.controller;

import com.apimeasurementconversion.apiformeasurementconversion.service.ConvertingService;
import com.apimeasurementconversion.apiformeasurementconversion.service.MeasurementService;
import com.apimeasurementconversion.apiformeasurementconversion.service.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A REST controller that handles measurement conversions.
 */
@RestController
@RequestMapping(path = "convert-measurements")
@CrossOrigin("*")
public class MeasurementController {

    @Autowired
    MeasurementService measurementService;
    @Autowired
    ConvertingService convertingService;
    @Autowired
    Validation validateInputString;

    /**
     * Converts the input measurements and returns the converted result.
     *
     * @param inputString The input measurements as a string.
     * @return The converted measurements as a list of integers.
     */
    @GetMapping
    public List<Integer> convertMeasurements(@RequestParam(value = "input",defaultValue = "") String inputString) {
        List<Integer> result;

        if (validateInputString.validateInputString(inputString)) {
            return null;
        } else {
            int[] convertString = convertingService.convertString(inputString);
            result = measurementService.processResult(convertString);
        }
        return result;
    }
}