package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_30 {
    public static void main(String[] args) {
        int N = 50;
        boolean[][] arr = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            StdOut.print(i);
            if(i <= 9) StdOut.print(" ");
            for (int j = 0; j < N; j++) {
                if (euclid(i, j) == 1) {
                    arr[i][j] = true;
                    StdOut.print("*");
                }
                else {
                    arr[i][j] = false;
                    StdOut.print("-");
                }
            }
            StdOut.print("\n");
        }
    }


    public static int euclid(int p, int q) {
        if(q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }
}
