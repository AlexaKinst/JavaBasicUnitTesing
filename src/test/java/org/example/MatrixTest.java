package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixTest {
    @Test
    public void Test() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        int sum = 0;

        for (int[] a : matrix) {
            for (int x = 0; x < matrix.length; x++) {
                sum += a[x];
            }
        }
        int average = sum / matrix.length;

        Assertions.assertEquals(5, average);
    }
}
