package com.sebastian;

public class ArrayQueue<E> implements Queue<E> {

    private E[] data;
    private int front;
    private int rear;
    private int size;
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
    @SuppressWarnings("unchecked")
    public ArrayQueue(int initialCapacity) {

        this.checkCapacity(initialCapacity);
        this.data = (E[]) new Object[initialCapacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;

    }// ArrayQueue()

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }// ArrayQueue()

    // =======================================================================================================

    private void checkCapacity(int capacity) {

        if ((capacity <= 0)) {
            String err = "Invalid capacity: " + capacity;
            throw new IllegalArgumentException(err);
        } // if()

    }// checkCapacity()
     // =======================================================================================================

    /** {@inheritDoc} */
    @Override
    public void enqueue(E elem) {

        if ((this.isFull())) {
            this.expandCapacity();

        } // if

        else if ((this.isEmpty())) {
            this.front++;
            this.rear++;
            this.data[this.front] = elem;
            this.data[this.rear] = elem;
            this.size++;

        } // else if

        else {

            this.rear++;
            this.data[this.rear] = elem;
            this.size++;

        } // else

    }// enqueue()

    // =======================================================================================================

    @SuppressWarnings("unchecked")
    private void expandCapacity() {

        int oldSize = this.size();
        int newSize = oldSize * 2;

        E[] temp = (E[]) new Object[newSize];

        for (int i = 0; i < newSize; i++) {
            temp[i] = this.data[i];
        } // for()

        this.data = temp;

    } // expandCapacity()
      // =======================================================================================================

    @Override
    public void dequeue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    // =======================================================================================================

    /** {@inheritDoc} */
    @Override
    public boolean isFull() {
        return ((this.size() == DEFAULT_CAPACITY));
    }// isFull()
     // =======================================================================================================

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {
        return ((this.size() == 0));
    }// isEmpty()
     // =======================================================================================================

    /** {@inheritDoc} */
    @Override
    public int size() {
        return this.size;
    }// size()

    // =======================================================================================================

    /** {@inheritDoc} */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        int n = this.size();

        for (int i = 0; i < n; i++) {

            sb.append(this.data[i]);

            if ((i < (n - 1))) {
                sb.append(", ");
            } // if()
        } // for()

        return sb.append("]").toString();

    }// toString()

}// class