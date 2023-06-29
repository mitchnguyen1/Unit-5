package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberPerformanceTest {

    private int max = 10;
    //missing 6
    private int[] array1 = {2, 1, 4, 3, 8, 5, 7, 10, 9};

    //missing max
    private int[] array2 = {2, 1, 4, 3, 8, 5, 7, 6, 9};

    //missing none
    private int[] array3 = {2, 1, 10, 4, 3, 8, 5, 7, 10, 9};

    private MissingNumber m = new MissingNumber();

    @Test(timeout=100)
    public void missingNumSum() {
        for (int i = 0; i < 1000000; i += 1) {
            m.MissingNumSum(array1, max);
            m.MissingNumSum(array2, max);
            m.MissingNumSum(array3, max);
        }
    }
    @Test(timeout=100)
    public void missingNumber() {
        for (int i = 0; i < 1000000; i += 1) {
            m.missingNumber(array1, max);
            m.missingNumber(array2, max);
            m.missingNumber(array3, max);
        }
    }



}
