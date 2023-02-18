package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise_1_1_27 {
    public static double binominal(int N, int k, double p) {
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binominal(N-1, k, p) + p * binominal(N-1, k-1, p);
    }

    public static void main(String[] args) {
        int N = 100;
        int k = 50;
        double p = 0.5;
        double[][] arr = new double[N + 1][k + 1];
        for(int row = 0; row < arr.length; row++)
            for(int col = 0; col < arr[0].length; col++)
                arr[row][col] = -1.0;

        StdOut.printf("Result = %f", binominalArray(N, k, p, arr));
        //StdOut.printf("Result = %f", binominal(N, k, p));
    }

    public static double binominalArray(int N, int k, double p, double[][] arr) {
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        if(arr[N][k] == -1.0)
            arr[N][k] = (1.0 - p) * binominalArray(N-1, k, p, arr) + p * binominalArray(N-1, k-1, p, arr);

        return arr[N][k];
    }
}
