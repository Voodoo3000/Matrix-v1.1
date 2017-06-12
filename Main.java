package com.voodoo.dtstr;

import com.voodoo.dtstr.api.Builder;
import com.voodoo.dtstr.api.Calculator;
import com.voodoo.dtstr.implementation.MatrixBuilder;
import com.voodoo.dtstr.implementation.MatrixCalculator;

public class Main {
    public static void main(String[] args) {
        Builder builder = new MatrixBuilder();
        int[][] matrixA = builder.build();
        int[][] matrixB = builder.build();
        Calculator calc = new MatrixCalculator();
        calc.multiply(matrixA,matrixB);
    }
}
