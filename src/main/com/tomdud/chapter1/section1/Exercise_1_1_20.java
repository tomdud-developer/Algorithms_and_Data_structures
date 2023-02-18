package com.tomdud.chapter1.section1;

public class Exercise_1_1_20 {

    public static void main(String[] args) {

    }

    //ln(N!)
    public static double lnNfactorial(int n) {
        return Math.log(factorial(n));
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        else return factorial(n - 1) * n;
    }
}
