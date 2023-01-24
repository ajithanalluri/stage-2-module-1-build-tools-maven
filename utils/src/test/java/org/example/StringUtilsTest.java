package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.StringUtils.isPositiveNumber;

class StringUtilsTest {

    @Test
    void isPositiveTest() {
        Assertions.assertTrue(isPositiveNumber("10"));
        Assertions.assertFalse(isPositiveNumber("9"));
    }
}
