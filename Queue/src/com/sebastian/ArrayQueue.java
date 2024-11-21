package com.sebastian;

public class ArrayQueue<E> implements Queue<E> {

    private int front;
    private int rear;
    private static final int DEFAULT_CAPACITY = 10;

    // =======================================================================================================

    /**
     * Constructs an empty queue. The size of the queue will be the value given to
     * {@code initialCapacity}.
     * 
     * @param initialCapacity - The initial size of the queue.
     * 
     * @throws IllegalArgumentException If the initial capacity is invalid.
     */
    public ArrayQueue(int initialCapacity) {

        this.checkCapacity(initialCapacity);
        this.front = -1;
        this.rear = -1;

    }// ArrayQueue()

    // =======================================================================================================

    private void checkCapacity(int capacity) {

        if ((capacity <= 0)) {
            String err = "Invalid capacity: " + capacity;
            throw new IllegalArgumentException(err);
        } // if()

    }// checkCapacity()
     // =======================================================================================================

    @Override
    public void enqueue(E elem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    // =======================================================================================================

    @Override
    public void dequeue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    // =======================================================================================================

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }
    // =======================================================================================================

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    // =======================================================================================================

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    // =======================================================================================================

}// class