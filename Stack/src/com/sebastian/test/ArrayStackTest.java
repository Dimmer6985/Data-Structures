package com.sebastian.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sebastian.ArrayStack;

public class ArrayStackTest {

    private ArrayStack<Integer> stk;

    @Before
    public void setUp() {

        stk = new ArrayStack<>();

        stk.push(25);
        stk.push(84);
        stk.push(69);
        stk.push(23);
        stk.push(53);

    } // setUp()

    // =========================================================================================

    @Test
    public void testToStringAsExpected() {

        String expected = "[53, 23, 69, 84, 25]";

        String result = stk.toString();

        assertEquals(expected, result);

    }// testToStringAsExpected()

    // =========================================================================================

    @Test
    public void testToStringWhenEmpty() {

        ArrayStack<Integer> obj = new ArrayStack<>();

        String expected = "[]";
        String result = obj.toString();

        assertEquals(expected, result);

    } // testToStringWhenEmpty()

    // =========================================================================================

}// class