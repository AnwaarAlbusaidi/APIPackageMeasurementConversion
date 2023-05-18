package com.apimeasurementconversion.apiformeasurementconversion.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the ConvertingService.
 */
class ConvertingServiceTest {

    private ConvertingService convertingService;

    @BeforeEach
    public void setUp() {
        convertingService = new ConvertingService();
    }
    /**
     * Test case for converting a string with characters 'a'.
     */
    @Test
    public void testConvertString1() {
        // Arrange
        String input = "aa";
        int[] expected = {1,1};

        // Act
        int[] result = convertingService.convertString(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    /**
     * Test case for converting a string with a mix of characters 'a' to 'd' and an underscore '_'.
     */
    @Test
    public void testConvertString2() {
        // Arrange
        String input = "abcdabcdab_";
        int[] expected = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 0};

        // Act
        int[] result = convertingService.convertString(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    /**
     * Test case for converting a string with the character 'z' and a mix of  characters 'a' to 'd'.
     */
    @Test
    public void testConvertString3() {
        // Arrange
        String input = "zdaaaaaaaabaaaaaaaabaaaaaaaabbaa";
        int[] expected = {30, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1};

        // Act
        int[] result = convertingService.convertString(input);

        // Assert
        assertArrayEquals(expected, result);
    }


    /**
     * Test case for converting a string with the character 'a' and an underscore '_'.
     */
    @Test
    public void testConvertString4() {
        // Arrange
        String input = "a_";
        int[] expected = {1,0};

        // Act
        int[] result = convertingService.convertString(input);

        // Assert
        assertArrayEquals(expected, result);
    }

    /**
     * Test case for converting a string with a mix of  characters 'a' and 'z'.
     */
    @Test
    public void testConvertString5() {
        // Arrange
        String input = "dz_a_aazzaaa";
        int[] expected = {4, 26, 1, 0, 1, 1, 53, 1, 1};

        // Act
        int[] result = convertingService.convertString(input);

        // Assert
        assertArrayEquals(expected, result);
    }

}