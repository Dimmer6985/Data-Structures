package com.sebastian;

public interface List<E> {

    /**
     * Appends the specified element to the beginning of the list.
     * 
     * @param elem - The element to be added to the list.
     */
    public void addFirst(E elem);

    /**
     * Appends the specified element to the end of the list.
     * 
     * @param elem - The element to be added to the list.
     */
    public void addLast(E elem);

    /**
     * Removes and returns the first element from the list.
     * 
     * @throws NoSuchElementException - If the list does not contain any elements.
     * @return The first element of the list.
     */
    public E removeFirst();

    /**
     * Removes and returns the last element from the list.
     * 
     * @throws NoSuchElementException - If the list does not contain any elements.
     * 
     * @return The last element of the list.
     */
    public E removeLast();

    /**
     * Returns the number of elements in the list.
     * 
     * @return The number of elements in the list.
     */
    public int size();

    /**
     * Determines if the specified element is found in the list.
     * 
     * @param elem - The specified element to search for in the list.
     * @return True if the element is found in the list, false otherwise.
     */
    public boolean contains(E elem);

    /**
     * Returns the first element in the list.
     * 
     * @throws NoSuchElementException - If the list does not contain any elements.
     * 
     * @return The first Element in the list.
     */
    public E getFirst();

    /**
     * Returns the last element in the list.
     * 
     * @throws NoSuchElementException - If the list does not contain any elements.
     * 
     * @return The last element in the list.
     */
    public E getLast();

}// interface
