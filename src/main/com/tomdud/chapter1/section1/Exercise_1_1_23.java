package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_23 {

    public static void main(String[] args) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();

        StdOut.println(euclid(p, q));
    }

    public static int euclid(int p, int q) {
        StdOut.printf("p = %d, q = %d\n", p, q);
        if(q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }
}
