package com.sebastian.test;

import static org.junit.Assert.assertEquals;

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
}// class