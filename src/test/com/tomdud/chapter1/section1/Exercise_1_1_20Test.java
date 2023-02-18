package com.tomdud.chapter1.section1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise_1_1_20Test {

    @Test
    public void lnNfactorial() {
        assertEquals(8.525161361, Exercise_1_1_20.lnNfactorial(7), 0.000001);
    }

    @Test
    public void factorial() {
        assertEquals(1, Exercise_1_1_20.factorial(0));
        assertEquals(1, Exercise_1_1_20.factorial(1));
        assertEquals(2, Exercise_1_1_20.factorial(2));
        assertEquals(1 * 2 * 3 * 4 * 5, Exercise_1_1_20.factorial(5));
        assertEquals(1 * 2 * 3 * 4 * 5 * 6, Exercise_1_1_20.factorial(6));
    }
}