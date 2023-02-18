package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_21 {

    public static void main(String[] args) {
        String line = StdIn.readLine();
        String[] strs = line.split(" ");
        String lastname = "";
        double number1 = 0.0;
        double number2 = 0.0;

        try {
            lastname = strs[0];
            number1 = Double.parseDouble(strs[1]);
            number2 = Double.parseDouble(strs[2]);
        } catch(Exception e) {
            StdOut.printf(e.getMessage());
        }

        StdOut.printf("| %s | %.3f", lastname, number1 / number2);
    }
}
