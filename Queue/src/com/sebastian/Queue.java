package com.sebastian;

import java.util.NoSuchElementException;

public interface Queue<E> {

    /**
     * Inserts the specified element at the end of the queue.
     * 
     * @param elem - The element to be inserted.
     */
    void enqueue(E elem);

    /**
     * Removes the element located at the front of the queue.
     * 
     * @throws NoSuchElementException If the queue is empty.
     */
    void dequeue();

    /**
     * Determines if the queue is full.
     * 
     * @return True if the queue is full; false otherwise.
     */
    boolean isFull();

    /**
     * Determines if the queue is empty.
     * 
     * @return True if the queue is empty; false otherwise.
     */
    boolean isEmpty();

    /**
     * Retrieves the number of elements in the queue.
     * 
     * @return The size of the queue.
     */
    int size();
}// interface