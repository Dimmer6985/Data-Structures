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

    // =========================================================================================

    @Test
    public void testToStringWhenCapacityIsExpanded() {

        stk.push(34);
        stk.push(75);
        stk.push(80);
        stk.push(95);
        stk.push(10);
        stk.push(55);
        stk.push(100);
        stk.push(200);

        String expected = "[200, 100, 55, 10, 95, 80, 75, 34, 53, 23, 69, 84, 25]";
        String result = stk.toString();
        assertEquals(expected, result);

    }// testSizeWhenCapacityIsExpanded()
     // =========================================================================================

    @Test
    public void testSizeAsExpected() {

        int expected = 5;
        int result = stk.size();
        assertEquals(expected, result);

    }// testSizeAsExpected()

    // =========================================================================================

    @Test
    public void testSizeWhenFull() {

        stk.push(34);
        stk.push(75);
        stk.push(80);
        stk.push(95);
        stk.push(10);

        int expected = 10;
        int result = stk.size();
        assertEquals(expected, result);

    }// testSizeWhenFull()

    // =========================================================================================

    @Test
    public void testSizeWhenEmpty() {

        ArrayStack<Integer> obj = new ArrayStack<>();

        int expected = 0;
        int result = obj.size();
        assertEquals(expected, result);

    }// testSizeWhenEmpty()

    // =========================================================================================

    @Test
    public void testSizeWhenRemovingElements() {

        for (int i = 0; i < 3; i++) {
            stk.pop();
        } // for()

        int expected = 2;
        int result = stk.size();
        assertEquals(expected, result);

    }// testSizeWhenRemovingElements()

    // =========================================================================================

    @Test
    public void testSizeWhenCapacityIsExpanded() {

        stk.push(34);
        stk.push(75);
        stk.push(80);
        stk.push(95);
        stk.push(10);
        stk.push(55);
        stk.push(100);
        stk.push(200);

        int expected = 13;
        int result = stk.size();
        assertEquals(expected, result);

    }// testSizeWhenCapacityIsExpanded()

    // =========================================================================================

    @Test
    public void testSearchAsExpected() {

        int elem1 = 53;
        int expected1 = 4;
        int result1 = stk.search(elem1);
        assertEquals(expected1, result1);

        int elem2 = 69;
        int expected2 = 2;
        int result2 = stk.search(elem2);
        assertEquals(expected2, result2);

        int elem3 = 84;
        int expected3 = 1;
        int result3 = stk.search(elem3);
        assertEquals(expected3, result3);

    }// testSearchAsExpected()
}// class