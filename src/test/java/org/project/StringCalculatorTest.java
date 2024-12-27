package org.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private final StringCalculator stringCalculator = new StringCalculator();
    private final String NEGATIVE_NUMBERS_MESSAGE = "negative numbers not allowed ";

    @Test
    public void testZeroArguments(){
        int sum = stringCalculator.add("");
        assertEquals(0, sum);
    }

    @Test
    public void testOneArgument(){
        int sum = stringCalculator.add("2");
        assertEquals(2, sum);
    }

    @Test
    public void testTwoArguments(){
        int sum = stringCalculator.add("5,2");
        assertEquals(7, sum);
    }

    @Test
    public void testArgumentsSeparatedByNewline(){
        int sum = stringCalculator.add("5\n2");
        assertEquals(7, sum);
    }

    @Test
    public void testMultipleArguments(){
        int sum = stringCalculator.add("4,10\n1,3");
        assertEquals(18, sum);
    }

    @Test
    public void testCustomerDelimiters(){
        int sum = stringCalculator.add("//;\n1;2");
        assertEquals(3, sum);
    }

    @Test
    public void testNegativeNumbers(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("3,-5,4"));
        assertEquals(NEGATIVE_NUMBERS_MESSAGE + "[-5]", exception.getMessage());
    }

    @Test
    public void testMultipleNegativeNumbers(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("-3\n4,1\n-1,-4"));
        assertEquals(NEGATIVE_NUMBERS_MESSAGE + "[-3, -1, -4]", exception.getMessage());
    }
}
