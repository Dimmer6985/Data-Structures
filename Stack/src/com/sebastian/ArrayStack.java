package com.sebastian;

import com.sebastian.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

    private E[] data;

    private int top = -1;

    private static int DEFAULT_CAPACITY = 10;

    // ===================================================================================================================

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

    // ===================================================================================================================

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

    // ===================================================================================================================

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }// ArrayStack()

    // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(E elem) {

        this.data[this.top] = elem;
        this.top++;

    } // push()

    // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public void pop() {

        if ((isEmpty())) {
            String err = "Cannot remove an element on an empty stack!";
            throw new EmptyStackException(err);
        } // if()

        this.top--;
    } // pop()

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {

        return ((this.top == -1));

    } // isEmpty()

    // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public E peek() {

        if ((isEmpty())) {
            String err = "Cannot peek at the top element because the stack is empty!";
            throw new EmptyStackException(err);
        } // if()

        return this.data[this.top];

    } // peek()

    // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public int search(E elem) {
        int n = this.size();

        for (int i = 0; i < n; i++) {

            if ((this.data[i] == elem)) {
                return i;
            } // if()

        } // for()

        return -1;
    }// search()

    // ===================================================================================================================

    @Override
    public int size() {
        return this.top + 1;
    }// size()
}// class