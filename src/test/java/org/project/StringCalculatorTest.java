package org.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testZeroArguments(){
        int sum = stringCalculator.add("");
        assertEquals(0, sum);
    }

}
