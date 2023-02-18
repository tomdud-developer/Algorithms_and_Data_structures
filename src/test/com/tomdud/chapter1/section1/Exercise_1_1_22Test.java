package com.tomdud.chapter1.section1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_1_1_22Test {

    @Test
    public void binarySearch() {
        Assert.assertEquals(4, Exercise_1_1_22.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 5));
    }

    @Test
    public void binarySearchRecursive() {
        Assert.assertEquals(4, Exercise_1_1_22.binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}, 5, 0));
        StdOut.println("");
        Assert.assertEquals(1, Exercise_1_1_22.binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}, 2, 0));
        StdOut.println("");
        Assert.assertEquals(13, Exercise_1_1_22.binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}, 14, 0));
        StdOut.println("");
        Assert.assertEquals(13, Exercise_1_1_22.binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17}, 14, 0));
        StdOut.println("");
        Assert.assertEquals(-1, Exercise_1_1_22.binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17}, -5, 0));
        StdOut.println("");
        Assert.assertEquals(-1, Exercise_1_1_22.binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17}, 20, 0));
        StdOut.println("");
    }
}