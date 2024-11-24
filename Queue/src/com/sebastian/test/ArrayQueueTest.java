package com.sebastian.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sebastian.ArrayQueue;

public class ArrayQueueTest {

    private ArrayQueue<String> queue;

    @Before
    public void setUp() {

        this.queue = new ArrayQueue<String>();

        this.queue.enqueue("Bob");
        this.queue.enqueue("Ally");
        this.queue.enqueue("Jacob");
        this.queue.enqueue("Steve");
        this.queue.enqueue("Daniel");
        this.queue.enqueue("Walter");
    }// setUp()

    // =======================================================================================================

    @Test
    public void testToStringAsExpected() {

        String expected = "[Bob, Ally, Jacob, Steve, Daniel, Walter]";
        String result = this.queue.toString();
        assertEquals(expected, result);
    }// testToStringAsExpected()
}// class
