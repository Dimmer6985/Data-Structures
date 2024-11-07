package com.sebastian;

public class ArrayStack<E> implements Stack<E> {

    private E[] data;

    private int top = -1;

    private static int DEFAULT_CAPACITY = 10;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    /**
     * Creates an empty stack with the specified capacity.
     * 
     * @param initialCapacity - The initial capacity of the stack.
     * 
     * @throws IllegalArgumentException - If the default capacity is invalid.
     */
    public ArrayStack(int initialCapacity) {
        checkCapacity(initialCapacity);
        this.data = (E[]) new Object();

    }// ArrayStack()

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Validates the stack's initial capacity.
     * 
     * @param initialCapacity The initial size of the stack.
     * 
     * @throws IllegalArgumentException - If the capacity is invalid.
     */
    private void checkCapacity(int initialCapacity) {

        if ((initialCapacity <= 0)) {
            String err = "Invalid capacity: " + initialCapacity;

            throw new IllegalArgumentException(err);

        } // if()

    }// checkCapacity()

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }// ArrayStack()

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

}// class