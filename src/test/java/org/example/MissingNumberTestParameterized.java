package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class MissingNumberTestParameterized {

    private int[] input;
    private int max;
    private int expectedOutput;

    public MissingNumberTestParameterized(int[] input, int max, int expectedOutput) {
        this.input = input;
        this.max = max;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        // Return a collection of test data as arrays
        return Arrays.asList(new Object[][]{
                {new int[]{2, 1, 4, 3, 8, 5, 7, 10, 9}, 10, 6},  // First test case: input=1, expectedOutput=2
                {new int[]{2, 1, 4, 6, 8, 5, 7, 10, 9}, 10, 3},  // Second test case: input=3, expectedOutput=6
                {new int[]{2, 1, 4, 3, 8, 5, 6, 10, 9}, 10, 7}  // Third test case: input=5, expectedOutput=10
        });
    }


    @Test
    public void missingNumSum() {
        int results = MissingNumber.MissingNumSum(input, max);
        assertEquals(expectedOutput, results);
    }

    @Test
    public void missingNumber() {
        int results = MissingNumber.missingNumber(input, max);
        assertEquals(expectedOutput, results);
    }
}
