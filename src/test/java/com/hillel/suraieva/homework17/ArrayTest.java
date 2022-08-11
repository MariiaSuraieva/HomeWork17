package com.hillel.suraieva.homework17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    int[][] array = {{1, 2, 3}, {4, 5, 6}};

    @Test
    public void average() {
        Assertions.assertEquals(3.5, Array.getAverage(array));
    }


    @Test
    public void same() {
        Assertions.assertFalse(Array.isSame(array));
    }

}
