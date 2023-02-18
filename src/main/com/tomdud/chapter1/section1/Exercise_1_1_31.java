package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import javafx.util.Pair;

import java.awt.*;
import java.util.ArrayList;

public class Exercise_1_1_31 {
    public static void main(String[] args) {

        int N = 100;
        double p = 0.1;
        double r = 0.4;


        StdDraw.setPenColor(Color.RED);
        StdDraw.circle(0.5, 0.5, r);

        StdDraw.setPenColor(Color.BLUE);
        StdDraw.setPenRadius(0.03);

        ArrayList<Pair> points = new ArrayList<>();

        for(double a = 0; a < 2 * Math.PI; a += 2 * Math.PI / (double)N) {
            double y = Math.sin(a/2)  * 2 * (Math.sin(a/2) * r);
            double x = Math.cos(a/2)  * 2 * (Math.sin(a/2) * r);

            double xCoordinate = 0.5 + x;
            double yCoordinate = 0.5 + r - y;

            StdDraw.point(xCoordinate, yCoordinate);
            points.add(new Pair<Double, Double>(xCoordinate, yCoordinate));
        }

        StdDraw.setPenColor(Color.GRAY);
        StdDraw.setPenRadius(0.0005);

        for(int i = 0; i < points.size(); i++) {
            for(int j = i+1; j < points.size(); j++) {
                StdOut.printf("Pair %d %d \n", i, j);
                boolean shouldConnected = StdRandom.bernoulli(p);
                if(shouldConnected) {
                    Double x0 = (double)points.get(i).getKey();
                    Double y0 = (double)points.get(i).getValue();
                    Double x1 = (double)points.get(j).getKey();
                    Double y1 = (double)points.get(j).getValue();
                    StdDraw.line(x0, y0, x1, y1);
                }
            }
        }


    }


}
