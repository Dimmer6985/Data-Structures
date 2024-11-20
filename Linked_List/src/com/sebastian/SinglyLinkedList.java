package com.sebastian;

public class SinglyLinkedList<E> implements List<E> {

    /** Reference to the head of the list */
    private ListNode<E> head;

    /** Keeps track of the number of elements in the list. */
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }// SinglyLinkedList()

    // ===============================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public void addFirst(E elem) {

        // Creating a new node containing the element to be added
        ListNode<E> newNode = new ListNode<E>(elem);

        this.head.next = newNode;

        this.head = newNode;

    }// addFirst()

    // ===============================================================================================================

    @Override
    public void addLast(E elem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLast'");
    }

    // ===============================================================================================================

    @Override
    public E removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    // ===============================================================================================================

    @Override
    public E removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }
    // ===============================================================================================================

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    // ===============================================================================================================

    @Override
    public boolean contains(E elem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    // ===============================================================================================================

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFirst'");
    }
    // ===============================================================================================================

    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLast'");
    }

    // ===============================================================================================================

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {

        return ((this.size == 0));

    }// isEmpty()

    // ===============================================================================================================

    private void incrementSize() {

        this.size++;

    }// incrementSize()
}// class
