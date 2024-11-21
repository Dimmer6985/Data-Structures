package com.sebastian;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements List<E> {

    /** Reference to the head of the list */
    private ListNode<E> head;

    /** Keeps track of the number of elements in the list. */
    private int size;

    // ===============================================================================================================

    /** Constructs and empty list */
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }// SinglyLinkedList()

    // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public void addFirst(E elem) {

        // Creating a new node containing the element to be added
        ListNode<E> newNode = new ListNode<E>(elem);

        newNode.next = this.head;
        this.head = newNode;

        this.incrementSize();

    }// addFirst()

    // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public void addLast(E elem) {

        if ((this.isEmpty())) {

            this.addFirst(elem);
        } // if()

        ListNode<E> newNode = new ListNode<E>(elem);

        ListNode<E> temp = this.head;

        while ((temp.next != null)) {
            temp = temp.next;
        } // while()

        temp.next = newNode;

        this.incrementSize();

    }// addLast()

    // ===============================================================================================================
    /** {@inheritDoc} */
    @Override
    public void removeFirst() {

        if ((this.isEmpty())) {
            String err = "Cannot perform 'removeFirst' operation on an empty list!";
            throw new NoSuchElementException(err);

        } // if()

        this.head = this.head.next;
        this.decrementSize();
    }// removeFirst()

    // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public void removeLast() {

        if ((this.isEmpty())) {
            String err = "Cannot perform 'removeLast' operation on an empty list!";
            throw new NoSuchElementException(err);

        }

        else if ((this.size == 1)) {

            this.removeFirst();

        }

        else {

            ListNode<E> temp = this.head;

            this.removeLast(temp);

        }

        // while ((temp.next.next != null)) {
        // temp = temp.next;
        // } // while()

        // temp.next = null;
        // this.decrementSize();

    }// removeLast()

    // ===============================================================================================================

    /**
     * Recursively removes the last element in the list.
     * 
     * @param temp - Temporary node used to traverse the list.
     */
    private void removeLast(ListNode<E> temp) {

        if ((temp.next.next == null)) {

            temp.next = null;
            this.decrementSize();

        }

        else {

            temp = temp.next;
            this.removeLast(temp);
        }

    }// removeLast()
     // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public int size() {
        return this.size;
    }// size()

    // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public boolean contains(E elem) {
        int index = this.search(elem);

        if ((index != -1)) {
            return true;

        }

        else {
            return false;
        }
    }// contains()

    // ===============================================================================================================

    private int search(E elem) {

        ListNode<E> temp = this.head;
        int index = 0;

        while ((temp != null)) {

            if ((temp.data == elem)) {
                return index;
            } // if()

            temp = temp.next;
            index++;

        } // while()

        return -1;

    }// search()
     // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFirst'");
    }
    // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLast'");
    }

    // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {

        return ((this.size == 0));

    }// isEmpty()

    // ===============================================================================================================

    private void incrementSize() {

        this.size++;

    }// incrementSize()

    // ===============================================================================================================

    private void decrementSize() {

        this.size--;

    }// decrementSize()
     // ===============================================================================================================

    /** {@inheritDoc} */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        ListNode<E> temp = this.head;

        while ((temp != null)) {

            sb.append(temp.data);

            if ((temp.next != null)) {
                sb.append("-> ");
            } // if()

            temp = temp.next;

        } // while()

        return sb.toString();

    }// toString()
}// class
