package com.sebastian.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.sebastian.SinglyLinkedList;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> list;

    @Before
    public void setUp() {

        this.list = new SinglyLinkedList<Integer>();

        this.list.addFirst(10);
        this.list.addFirst(50);
        this.list.addFirst(12);
        this.list.addLast(15);
        this.list.addLast(1);
        this.list.addLast(0);
    }// setUp()

    // ===============================================================================================================

    @Test
    public void testToStringAsExpected() {

        String expected = "12-> 50-> 10-> 15-> 1-> 0";
        String result = this.list.toString();
        assertEquals(expected, result);
    }// testToStringAsExpected()
     // ===============================================================================================================

    @Test
    public void testRemoveFirstAsExpected() {

        this.list.removeFirst();
        this.list.removeFirst();
        this.list.removeFirst();

        String expectedString = "15-> 1-> 0";
        String resultString = this.list.toString();
        assertEquals(expectedString, resultString);

        int expectedSize = 3;
        int resultSize = this.list.size();
        assertEquals(expectedSize, resultSize);
    }// testRemoveFirstAsExpected()

    // ===============================================================================================================

    @Test
    public void testRemoveFirstForEmptyList() {

        int n = this.list.size();

        for (int i = 0; i < n; i++) {
            this.list.removeFirst();
        } // for()

        try {
            this.list.removeFirst();

            String err = "NoSuchElementException expected to be thrown!";
            fail(err);
        } catch (NoSuchElementException e) {
            String expected = "Cannot perform 'removeFirst' operation on an empty list!";
            String result = e.getMessage();
            assertEquals(expected, result);
        } // catch()

    }// testRemoveFirstForEmptyList()

    // ===============================================================================================================

    @Test
    public void testRemoveLastAsExpected() {

        this.list.removeLast();
        this.list.removeLast();
        this.list.removeLast();

        String expectedString = "12-> 50-> 10";
        String resultString = this.list.toString();
        assertEquals(expectedString, resultString);

        int expectedSize = 3;
        int resultSize = this.list.size();
        assertEquals(expectedSize, resultSize);

    }// testRemoveLastAsExpected()

    // ===============================================================================================================

    @Test
    public void testRemoveLastForEmptyList() {

        int n = this.list.size();

        for (int i = 0; i < n; i++) {
            this.list.removeFirst();
        } // for()

        try {

            this.list.removeLast();

            String err = "NoSuchElementException expected to be thrown.";
            fail(err);
        } catch (NoSuchElementException e) {
            String expected = "Cannot perform 'removeLast' operation on an empty list!";
            String result = e.getMessage();
            assertEquals(expected, result);
        } // catch()

    }// testRemoveLastForEmptyList()

    // ===============================================================================================================

    @Test
    public void testContainsAsExpected() {

        boolean result1 = this.list.contains(50);
        assertTrue(result1);

        boolean result2 = this.list.contains(10);
        assertTrue(result2);

        boolean result3 = this.list.contains(-1);
        assertFalse(result3);

    }// testContainsAsExpected()

    // ===============================================================================================================

    @Test
    public void testContainsForEmptyList() {

        int n = this.list.size();

        for (int i = 0; i < n; i++) {
            this.list.removeFirst();
        } // for()

        boolean result = this.list.contains(5);
        assertFalse(result);

    }// testContainsForEmptyList()

    // ===============================================================================================================

    @Test
    public void testGetFirstAsExpected() {

        int expected = 12;
        int result = this.list.getFirst();
        assertEquals(expected, result);

    }// testGetFirstAsExpected()

    // ===============================================================================================================

}// class