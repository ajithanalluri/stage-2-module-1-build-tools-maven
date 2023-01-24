package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.Utils.isAllPositiveNumbers;

class UtilsTest {

    @Test
    void isAllPositiveTest() {
        Assertions.assertTrue(isAllPositiveNumbers(List.of("10", "12", "250")));
        Assertions.assertFalse(isAllPositiveNumbers(List.of("10", "11", "250")));
    }
}
