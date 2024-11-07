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

    @Test
    public void testToStringWhenFull() {

        stk.push(34);
        stk.push(75);
        stk.push(80);
        stk.push(95);
        stk.push(10);

        String expected = "[10, 95, 80, 75, 34, 53, 23, 69, 84, 25]";
        String result = stk.toString();
        assertEquals(expected, result);

    }// testToStringWhenFull()

}// class