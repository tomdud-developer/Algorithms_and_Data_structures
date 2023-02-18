package com.tomdud.chapter1.section1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_1_1_26Test {

    @Test
    public void tripleSort() {
        Assert.assertArrayEquals(new int[]{1,2,3}, Exercise_1_1_26.tripleSort(3,2,1));
    }
}