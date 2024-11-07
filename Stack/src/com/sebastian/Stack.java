package com.sebastian;

import java.util.EmptyStackException;

/**
 * Represents a generic Stack data structure.
 * 
 * @author Sebastian L. Corporan Berrios
 */
public interface Stack<E> {

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param elem The element to be inserted
     */
    public void push(E elem);

    /**
     * Removes the element at the top of the stack
     * 
     * @throws EmptyStackException - If the stack is empty.
     */
    public void pop();

    /**
     * Looks at the element at the top of the stack without removing it from the
     * stack.
     * 
     * @return the element at the top of the stack
     * 
     * @throws EmptyStackException - If the stack is empty.
     */
    public E peek();

    /**
     * Searches for the specified element in the stack.
     * 
     * @param elem - The element to search in the stack.
     * @return The position in which the element is located, -1 otherwise.
     * 
     * @throws EmptyStackException - If the stack is empty.
     */
    public int search(E elem);

    /**
     * Determines if the stack is empty.
     * 
     * @return True if the stack contains no elements; false otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     * 
     * @return The size of the stack.
     */
    public int size();

    /**
     * Displays a string representation of the stack.
     * 
     * @return A string representation of the stack.
     */
    public String toString();

} // interface