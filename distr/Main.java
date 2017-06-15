package com.voodoo.distr;

import com.voodoo.distr.api.Builder;
import com.voodoo.distr.api.Calculator;
import com.voodoo.distr.implementation.MatrixBuilder;
import com.voodoo.distr.implementation.MatrixCalculator;

public class Main {
    public static void main(String[] args) {
        Builder builder = new MatrixBuilder();
        int[][] matrixA = builder.build();
        int[][] matrixB = builder.build();
        Calculator calc = new MatrixCalculator();
        calc.multiply(matrixA,matrixB);
    }
}
