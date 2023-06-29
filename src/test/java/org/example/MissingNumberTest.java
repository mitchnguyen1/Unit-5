package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    private int max = 10;
    //missing 6
    private int[] array1 = {2, 1, 4, 3, 8, 5, 7, 10, 9};

    //missing max
    private int[] array2 = {2, 1, 4, 3, 8, 5, 7, 6, 9};

    //missing none
    private int[] array3 = {2, 1, 10, 4, 3, 8, 5, 7, 10, 9};

    //Object to call methods
    private MissingNumber m = new MissingNumber();

    @Test
    void missingNumber_MissingSix() {
        assertEquals(6,m.MissingNumSum(array1,max));
    }

    @Test
    void missingNumber_MissingMax() {
        assertEquals(max,m.MissingNumSum(array2,max));
    }

    @Test
    void missingNumber_MissingNone() {
        assertEquals(0,m.MissingNumSum(array3,max));
    }
}