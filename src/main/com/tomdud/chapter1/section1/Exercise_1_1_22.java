package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise_1_1_22 {

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if(binarySearch(whitelist, key) < 0) {
                StdOut.printf("%d is not on list", key);
            } else
                StdOut.printf("%d is on list", key);
        }
    }
    public static int binarySearch(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;

        while( low <= high ) {
            int mid = low + (high - low) / 2;
            if (n < array[mid]) high = mid - 1;
            else if (n > array[mid]) low = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] array, int n, int level) {
        int low = 0;
        int high = array.length - 1;
        int mid = low + (high - low) / 2;

        printLVL(low, high, level);

        if(high < low) return -1;
        if(array[mid] == n) return mid;
        else if(n < array[mid]) {
            int position = binarySearchRecursive(Arrays.copyOfRange(array, low, mid), n, level + 1);
            if(position < 0) return -1;
            else return position;
        }
        else if(n > array[mid]) {
            int position = binarySearchRecursive(Arrays.copyOfRange(array, mid+1, high+1), n, level + 1);
            if(position < 0) return -1;
            else return mid + 1 + position;
        }
        else return -1;
    }

    public static void printLVL(int lo, int hi, int level) {
        for(int i = 0; i < level; i++)
            StdOut.print("_");
        StdOut.printf("lo = %d  |  hi = %d\n", lo, hi);
    }
}
