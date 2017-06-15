package com.voodoo.distr.implementation;


import com.voodoo.distr.api.Calculator;

/**
 * Created by Voodoo3000 on 11.06.2017.
 */
public class MatrixCalculator implements Calculator {
    @Override
    public void multiply(int[][] matrixA, int[][] matrixB) {
        int aLines = matrixA.length;
        int aColumns = matrixA[0].length;
        int bColumns = matrixB[0].length;
        int[][] mResult = new int[aLines][bColumns];
        for(int i = 0; i < aLines; ++i) {
            for(int j = 0; j < bColumns; ++j) {
                for(int r = 0; r < aColumns; ++r) {
                    mResult[i][j] += matrixA[i][r] * matrixB[r][j];
                }
            }
        }
        System.out.println("Result: ");
        for(int i = 0; i < aLines; ++i) {
            for(int j = 0; j < bColumns; ++j) {
                System.out.format("%6d ", mResult[i][j]);
            }
            System.out.println();
        }
    }

}