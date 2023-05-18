package com.apimeasurementconversion.apiformeasurementconversion.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the MeasurementService.
 */
class MeasurementServiceTest {

    private MeasurementService measurementService;

    @BeforeEach
    public void setUp() {
        measurementService = new MeasurementService();
    }
    /**
     * Test case for a valid input where the input array has two elements.
     */
    @Test
    void testProcessResult1() {
        // Arrange
        int[] input = {1,1};
        List<Integer> expected = List.of(1);

        // Act
        List<Integer> result = measurementService.processResult(input);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case for a valid input with a mix of counter values, including zeros.
     */
    @Test
    void testProcessResult2() {
        // Arrange
        int[] input = {4, 26, 1, 0, 1, 1, 53, 1, 1};
        List<Integer> expected = List.of(28, 53, 1);

        // Act
        List<Integer> result = measurementService.processResult(input);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case for a valid input with a repeated pattern of counter values.
     */
    @Test
    void testProcessResult3() {
        // Arrange
        int[] input = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 0};
        List<Integer> expected = List.of(2,7,7,0);

        // Act
        List<Integer> result = measurementService.processResult(input);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case for a valid input where the counter value exceeds the array length.
     */
    @Test
    void testProcessResult4() {
        // Arrange
        int[] input = {53, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,
                1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        List<Integer> expected = List.of(26);

        // Act
        List<Integer> result = measurementService.processResult(input);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case for an empty input array.
     */
    @Test
    void testProcessResult_emptyString() {
        // Arrange
        int[] input = {};
        List<Integer> expected = List.of();

        // Act
        List<Integer> result = measurementService.processResult(input);

        // Assert
        assertEquals(expected, result);
    }



}