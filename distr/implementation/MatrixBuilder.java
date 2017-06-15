package com.voodoo.distr.implementation;

import com.voodoo.distr.api.Builder;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Voodoo3000 on 10.06.2017.
 */

public class MatrixBuilder implements Builder  {

    public int[][] build() {
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        System.out.print("Please enter Matrix line quantity: ");
        int lines = in.nextInt();
        System.out.print("Please enter Matrix column quantity: ");
        int columns = in.nextInt();
        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int r = 0; r <columns; r++) {
                matrix[i][r] = randNum.nextInt(20) - 10;
                System.out.format("%3d ", matrix[i][r]);
            }
            System.out.println();
        }
        return matrix;
    }
}
