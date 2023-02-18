package com.tomdud.chapter1.section1;

public class Exercise_1_1_26 {
    public static int[] tripleSort(int a, int b, int c) {
        int t;
        if(a > b) {
            t = a;
            a = b;
            b = t;
        }
        if(a > c) {
            t = a;
            a = c;
            c = t;
        }
        if(b > c) {
            t = b;
            b = c;
            c = t;
        }

        return new int[]{a, b, c};
    }
}
