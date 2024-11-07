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
        this.checkCapacity(initialCapacity);
        this.data = (E[]) new Object();

    }// ArrayStack()

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }// ArrayStack()

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///
    ///
}// class