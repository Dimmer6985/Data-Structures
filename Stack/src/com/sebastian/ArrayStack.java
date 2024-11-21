package com.sebastian;

import com.sebastian.EmptyStackException;

@SuppressWarnings("unused")
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
        this.checkCapacity(initialCapacity);
        this.data = (E[]) new Object[initialCapacity];

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

        if ((this.isFull())) {
            this.expandCapacity();
        } // if()

        this.top++;
        this.data[this.top] = elem;

    } // push()

    // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public void pop() {

        if ((this.isEmpty())) {
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

        if ((this.isEmpty())) {
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

        if ((this.isEmpty())) {
            return -1;

        }

        else {

            return search(this.data, elem, 0);
        }
    }// search()

    // ===================================================================================================================
    private int search(E[] arr, E elem, int index) {

        if ((index >= arr.length)) {
            return -1;

        }

        else if ((this.data[index] == elem)) {
            return index;

        }

        else {

            return this.search(this.data, elem, index + 1);
        }

    }// search()
     // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return this.top + 1;
    }// size()

    // ===================================================================================================================

    @SuppressWarnings("unchecked")
    public void expandCapacity() {

        int oldSize = this.data.length;
        int newSize = oldSize * 2;
        E[] temp = (E[]) new Object[newSize];

        int i = this.top;

        while ((i >= 0)) {

            temp[i] = this.data[i];
            i--;

        } // while()

        this.data = temp;

    } // expandCapacity()
      // ===================================================================================================================

    public boolean isFull() {

        return ((this.size() == DEFAULT_CAPACITY));
    } // isFull()
      // ===================================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        for (int i = this.top; i >= 0; i--) {

            sb.append(this.data[i]);

            if ((i != 0)) {
                sb.append(", ");
            } // if()

        } // for()

        return sb.append("]").toString();
    }// toString()
}// class